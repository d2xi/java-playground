package element;

import visitor.StuffMember;

public interface Element {
    public void accept(StuffMember stuffMember);
}
