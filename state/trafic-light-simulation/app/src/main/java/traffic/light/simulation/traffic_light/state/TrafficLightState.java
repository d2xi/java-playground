package traffic.light.simulation.traffic_light.state;

import traffic.light.simulation.traffic_light.TrafficLight;
import traffic.light.simulation.traffic_light.state.colour.TrafficLightColour;

public abstract class TrafficLightState {
    private TrafficLightColour colour;
    
    protected TrafficLightState(TrafficLightColour trafficLightColour) {
        this.colour = trafficLightColour;
    }

    public abstract void switchState(TrafficLight trafficLight);

    @Override
    public String toString() {
        return colour.toString();
    }

    public TrafficLightColour getColour() {
        return colour;
    }

}
