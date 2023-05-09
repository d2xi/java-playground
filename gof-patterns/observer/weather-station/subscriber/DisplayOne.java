package subscriber;
import broker.Subscriber;


public class DisplayOne implements Subscriber{

    @Override
    public void update(String msg) {
        System.out.println(this + " " + msg);
    }

    @Override
    public String toString() {
        return "Display One";
    }
    
}
