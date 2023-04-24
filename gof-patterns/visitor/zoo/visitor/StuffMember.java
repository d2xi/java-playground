package visitor;

public abstract class StuffMember implements Visitor{
    
    private String name;
    
    public StuffMember(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "StuffMember [name=" + name + "]";
    }

}
