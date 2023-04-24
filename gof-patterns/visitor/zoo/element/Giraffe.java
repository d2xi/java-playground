package element;

import visitor.StuffMember;

public class Giraffe extends Animal{

    public Giraffe(String name) {
        super("Giraffe "+ name,2647.4,36.9,true);
    }

    @Override
    public void accept(StuffMember stuffMember) {
        super.accept(stuffMember);
        stuffMember.visit(this);
    }

}
