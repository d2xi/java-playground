package commands;

import java.util.ArrayList;
import java.util.List;
import receivers.HasScreen;

public class NightMode implements Command {

    List<HasScreen> devices;

    public NightMode(HasScreen... devices) {
        this.devices = new ArrayList<>();
        for (HasScreen device: devices) {
            this.devices.add(device);
        }
    }

    @Override
    public void execute() {
        devices.forEach(HasScreen::turnOffScreen);
    }

    @Override
    public void undo() {

    }

    @Override
    public String toString() {
        return "activate night mode.";
    }
        
}
