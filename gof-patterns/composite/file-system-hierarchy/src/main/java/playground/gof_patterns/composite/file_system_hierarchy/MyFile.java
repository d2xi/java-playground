package  playground.gof_patterns.composite.file_system_hierarchy;

public class MyFile extends Component{
    
    public MyFile (int id) {
        super(id);
    }

    public void print(){
        final String msg = String.format("Printer job for file %s is set to the printer.", getName());
        System.out.println(msg);
    }
}
