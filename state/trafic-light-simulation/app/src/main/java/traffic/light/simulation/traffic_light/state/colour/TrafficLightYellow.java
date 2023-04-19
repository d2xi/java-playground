package traffic.light.simulation.traffic_light.state.colour;

import traffic.light.simulation.traffic_light.TrafficLight;
import traffic.light.simulation.traffic_light.state.TrafficLightState;

public class TrafficLightYellow extends TrafficLightState {

    public TrafficLightYellow() {
        super(TrafficLightColour.YELLOW);
    }
    
    @Override
    public void switchState(TrafficLight trafficLight) {
        trafficLight.setState(new TrafficLightRed());
    }

}
