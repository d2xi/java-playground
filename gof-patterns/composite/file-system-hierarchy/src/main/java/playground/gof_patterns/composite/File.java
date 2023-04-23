package main.java.playground.gof_patterns.composite;

import java.beans.IndexedPropertyChangeEvent;

public class File extends Component{
    
    public File (int id) {
        super(id);
    }

    public void print(){
        final String msg = String.format("Printer job for file %s is set to the printer.", getName());
        System.out.println(msg);
    }
}
