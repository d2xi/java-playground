package receivers;

import java.util.logging.Logger;

public class AudioDevice extends Device implements HasSound {

    private static  final Logger logger = Logger.getLogger(AudioDevice.class.getName());
    private int volume;

    public AudioDevice(String model) {
        super(model);
    }
    
    @Override
    public void setVolume(int volume) {
        String msg = String.format("Volume on %s has been changed from %d to %d.", getModel(), this.volume, volume);
        this.volume = volume;
        logger.info(msg);
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

}
