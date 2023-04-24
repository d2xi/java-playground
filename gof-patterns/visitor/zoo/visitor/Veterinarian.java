package visitor;

import element.Giraffe;
import element.Lion;

public class Veterinarian extends StuffMember{

    public Veterinarian(String name) {
        super("Veterinarian "+name);
    }

    @Override
    public void visit(Giraffe giraffe) {
        giraffe.meassureBodyTemperature();
    }
    
    @Override
    public void visit(Lion lion) {
        lion.meassureBodyTemperature();
        lion.getWeightInKg();
        lion.isTeethOk();
    }

}
