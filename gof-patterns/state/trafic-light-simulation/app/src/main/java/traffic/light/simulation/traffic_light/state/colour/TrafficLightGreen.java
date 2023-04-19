package traffic.light.simulation.traffic_light.state.colour;

import traffic.light.simulation.traffic_light.TrafficLight;
import traffic.light.simulation.traffic_light.state.TrafficLightState;

public class TrafficLightGreen extends TrafficLightState {
    
    public TrafficLightGreen() {
        super(TrafficLightColour.GREEN);
    }

    @Override
    public void switchState(TrafficLight trafficLight) {
        trafficLight.setState(new TrafficLightYellow());
    }
    
}
