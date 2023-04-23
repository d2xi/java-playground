package receivers;

import java.util.logging.Logger;

public abstract class AudioVideoDevice extends AudioDevice implements HasScreen {

    private static  final Logger logger = Logger.getLogger(AudioVideoDevice.class.getName());
    private String colorScheme;
    private boolean screenIsOn;

    public AudioVideoDevice(String model){
        super(model);
        this.colorScheme="DEFAULT";
    }

    @Override
    public void turnOnScreen() {
        this.screenIsOn = true;
        String msg = String.format("%s screen is on.",getModel());
        logger.info(msg);
    }

    @Override
    public void turnOffScreen() {
        this.screenIsOn = false;
        String msg = String.format("%s screen is off.",getModel());
        logger.info(msg);
    }

    @Override
    public void setColorScheme(String color) {
        String msg = String.format("Color scheme is changed from %s to %s", this.colorScheme, color);
        this.colorScheme = color;
        logger.info(msg);
    }

    @Override
    public String getColorScheme() {
        return this.colorScheme;
    }

}
