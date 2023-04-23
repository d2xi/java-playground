package commands;

import java.util.ArrayList;
import java.util.List;

import receivers.Device;

public class PrepareHome implements Command{
    
    List<Device> devices;

    public PrepareHome(Device... devices){
        this.devices = new ArrayList<>();
        for (Device device : devices){
            this.devices.add(device);
        }
    }

    @Override
    public void execute() {
        devices.forEach(Device::powerOn);
    }

    @Override
    public void undo() {
        devices.forEach(Device::powerOff);
    }
    
}
