package element;

import java.util.logging.Logger;

import visitor.StuffMember;

public abstract class Animal implements Element{
    
    private static final Logger LOGGER = Logger.getLogger(Animal.class.getName());

    private String name;
    private double weightKg;
    private double bodyTemperatureCelsius;
    
    private boolean teethHealthisOk;
    
    public Animal(String name, Double weightKg, Double bodyTemperatureCelsius, boolean healthyTeeth) {
        this.name = name;
        this.weightKg = weightKg;
        this.bodyTemperatureCelsius = bodyTemperatureCelsius;
        this.teethHealthisOk = false;
    }
    
    public String getName() {
        return name;
    }
    
    public double getWeightInKg() {
        String msg = String.format("%s's weight: %.2f Kg", getName(), weightKg);
        LOGGER.info(msg);
        return weightKg;
    }
    
    public double meassureBodyTemperature() {
        String msg = String.format("%s's temperature: %.2f Celsius", getName(), bodyTemperatureCelsius);
        LOGGER.info(msg);
        return bodyTemperatureCelsius;
    }

    public boolean isTeethOk() {
        String msg = String.format("%s's teeth healthy: %s", getName(), (teethHealthisOk)?"ok":"require treatmeant");
        LOGGER.info(msg);
        return this.teethHealthisOk;
    }

    @Override
    public void accept(StuffMember stuffMember) {
        String msg = String.format("The %s was visited by %s", getName(), stuffMember);
        LOGGER.info(msg);
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + "]";
    }

}
