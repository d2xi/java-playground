package traffic.light.simulation.dude;

import java.util.concurrent.atomic.AtomicBoolean;

import traffic.light.simulation.traffic_light.TrafficLight;

public class Dude implements Runnable{
    private final AtomicBoolean running = new AtomicBoolean(true);
    
    private TrafficLight trafficLight;
    
    public Dude(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void run() {
        while (running.get()) {
            System.out.println(trafficLight);
            try {
                System.out.println("*blink...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopThread() {
        running.set(false);
    }

}
