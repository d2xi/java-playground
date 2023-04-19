package traffic.light.simulation.street;

import traffic.light.simulation.dude.Dude;
import traffic.light.simulation.traffic_light.TrafficLight;

public class Street {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        Dude dude = new Dude(trafficLight);
        Thread t1 = new Thread(trafficLight);
        Thread t2 = new Thread(dude);
        t2.start();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dude.stopThread();
    }   
}