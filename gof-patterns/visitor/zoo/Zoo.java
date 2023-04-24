import element.Animal;
import element.Giraffe;
import element.Lion;
import visitor.StuffMember;
import visitor.Veterinarian;

public class Zoo {

    public static void main(String[] args) {
        Giraffe a1 = new Giraffe("Andy");
        Lion a2 = new Lion("Tony");
        StuffMember s1 = new Veterinarian("Anna");
        s1.visit(a1);
        s1.visit(a2);
    }
    
}
