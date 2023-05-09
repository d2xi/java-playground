package publisher;

import broker.EventManager;
import broker.EventType;

public class WeatherStation{

    EventManager eventManager;
    
    public WeatherStation(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public void setTemperatureCelcius(double temperatureCelcius) {
        eventManager.notifySubscribers(EventType.TEMPERATURE, String.valueOf(temperatureCelcius));
    }
    
    public void setWindDirection(String windDirection) {
        eventManager.notifySubscribers(EventType.WIND_DIRECTION, String.valueOf(windDirection));
    }

}