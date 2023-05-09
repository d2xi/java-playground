import publisher.*;
import broker.*;
import subscriber.*;

public class Main {
    
    public static void main(String[] args) {
        EventManager em = new EventManager();
        WeatherStation ws = new WeatherStation(em);

        // Decoupled from publisher
        Subscriber sub1 = new DisplayOne();
        Subscriber sub2 = new DisplayTwo();

        em.subscribe(EventType.TEMPERATURE, sub1);
        em.subscribe(EventType.WIND_DIRECTION, sub1);
        em.subscribe(EventType.WIND_DIRECTION, sub2);

        ws.setTemperatureCelcius(19.8);
        ws.setTemperatureCelcius(20);
        ws.setWindDirection("NW");
        ws.setTemperatureCelcius(21);
        ws.setWindDirection("N");
        ws.setWindDirection("NW");

        // I expect only Display One to be updated on temperature and both, Display One and Two, on wind direction.
    }

}
