package visitor;

import element.Giraffe;
import element.Lion;

public interface Visitor {
    public void visit(Giraffe giraffe);
    public void visit(Lion lion);
}
