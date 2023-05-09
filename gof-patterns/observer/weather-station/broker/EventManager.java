package broker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<EventType, List<Subscriber>> subscribers;

    public EventManager() {
        subscribers = new EnumMap<>(EventType.class);
    }

    public void subscribe(EventType eventType, Subscriber sub) {
        if (subscribers.containsKey(eventType)) {
            subscribers.get(eventType).add(sub);
        } else{
            subscribers.put(eventType, new ArrayList<>(Arrays.asList(sub)));
        }
        System.out.println(String.format("%s has subscribed to %s ", sub, eventType));
    }

    public void notifySubscribers(EventType eventType, String data) {
        String msg = String.format("%s %s", eventType, data);
        subscribers.get(eventType).stream().forEach(sub -> sub.update(msg));
    }

}