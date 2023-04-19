package traffic.light.simulation.traffic_light.state.colour;

import traffic.light.simulation.traffic_light.TrafficLight;
import traffic.light.simulation.traffic_light.state.TrafficLightState;

public class TrafficLightRed extends TrafficLightState{
    
    public TrafficLightRed() {
        super(TrafficLightColour.RED);
    }

    @Override
    public void switchState(TrafficLight trafficLight) {
        trafficLight.setState(new TrafficLightGreen());
    }
 
}
