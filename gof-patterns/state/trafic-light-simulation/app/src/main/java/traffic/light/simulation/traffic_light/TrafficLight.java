package traffic.light.simulation.traffic_light;

import traffic.light.simulation.traffic_light.state.TrafficLightState;
import traffic.light.simulation.traffic_light.state.colour.TrafficLightRed;

public class TrafficLight implements Runnable {

    private TrafficLightState currentState;
    private static Boolean running = true;

    public TrafficLight() {
        currentState = new TrafficLightRed();
    }

    private void set15secTimer() {
        new Thread(()->{
            System.out.println("Traffic light is set to run for 15 sec...");
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            running = false;
            System.out.println("Traffic light is suspended.");
        }).start();

    }

    public void switchState() {
        currentState.switchState(this);
    }

    public void setState(TrafficLightState state) {
        this.currentState = state;
    }

    @Override
    public String toString() {
        return currentState.toString();
    }

    @Override
    public void run() {
        set15secTimer();
        while(running) {
            switchState();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
