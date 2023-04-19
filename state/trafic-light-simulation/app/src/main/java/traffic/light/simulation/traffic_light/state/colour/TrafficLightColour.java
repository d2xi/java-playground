package traffic.light.simulation.traffic_light.state.colour;

public enum TrafficLightColour {
    GREEN("GREEN"),
    YELLOW("YELLOW"),
    RED("RED");
    
    private String colour;

    private TrafficLightColour(String value) {
        this.colour = value;
    }

    @Override
    public String toString() {
        return this.colour;
    }
}
