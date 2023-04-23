package commands;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.ArrayList;

import receivers.AudioDevice;

public class MuteVolume implements Command{

    List<AudioDevice> devices;
    List<Integer> volumeLevels;

    public MuteVolume(AudioDevice... devices) {
        this.devices =  new ArrayList<>();
        this.volumeLevels = new ArrayList<>();
        for (AudioDevice device: devices) {
            this.devices.add(device);
            this.volumeLevels.add(device.getVolume());
        }
    }

    @Override
    public void execute() {
        volumeLevels = devices.stream().map(AudioDevice::getVolume).collect(Collectors.toList());
        devices.stream().forEach(device -> device.setVolume(0));
    }

    @Override
    public void undo() {
        IntStream.range(0,Math.min(devices.size(), volumeLevels.size())).forEach(id->devices.get(id).setVolume(volumeLevels.get(id)));
    }

    @Override
    public String toString() {
        return "mute all devices.";
    }
        
}
