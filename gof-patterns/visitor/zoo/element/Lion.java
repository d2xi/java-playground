package element;

import java.util.logging.Logger;

import visitor.StuffMember;

public class Lion extends Animal{

    public Lion(String name) {
        super("Lion "+name,224.63,39.1,false);
    }

    @Override
    public void accept(StuffMember stuffMember) {
        super.accept(stuffMember);
        stuffMember.visit(this);
    }
}