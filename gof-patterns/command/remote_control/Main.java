import commands.MuteVolume;
import commands.NightMode;
import receivers.AudioDevice;
import receivers.AudioVideoDevice;
import receivers.Radio;
import receivers.Television;
import remotes.Remote;
import remotes.TwoSlotRemoteControl;

public class Main {
    
    public static void main(String[] args) {
        Remote myRemote = new TwoSlotRemoteControl();
        AudioDevice dev1 = new Radio("kitcher radio");
        AudioVideoDevice dev2 = new Television("living room television");
        myRemote.setCommand(0, new MuteVolume(dev1,dev2));
        myRemote.setCommand(1, new NightMode(dev2));
        myRemote.executeCommand(0);
        myRemote.undoLastCommand();
        myRemote.executeCommand(1);
        myRemote.undoLastCommand();
        myRemote.executeCommand(0);
        ((TwoSlotRemoteControl) myRemote).printHistory();
    }
}
