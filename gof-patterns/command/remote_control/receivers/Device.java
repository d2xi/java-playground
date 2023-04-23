package receivers;
import java.util.logging.Logger;
public abstract class Device {
    
    private static  final Logger logger = Logger.getLogger(Device.class.getName());
    private String model;
    private boolean isOn;

    public Device(String model) {
        this.model = model;
        this.isOn = false;
    }

    public String getModel() {
        return model;
    }

    public void powerOn() {
        isOn = true;
        String msg = String.format("%s power is on.", getModel());
        logger.info(msg);
    } 
    
    public void powerOff() {
        isOn = true;
        String msg = String.format("%s power is off.", getModel());
        logger.info(msg);
    }

    public boolean isDevicePowered() {
        return this.isOn;
    }

}
