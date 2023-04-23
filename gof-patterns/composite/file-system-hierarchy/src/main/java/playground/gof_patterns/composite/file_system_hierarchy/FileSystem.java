package  playground.gof_patterns.composite.file_system_hierarchy;

import java.util.List;
import java.util.LinkedList;

public class FileSystem {
    
    public static void main(String[] args) {
        List<Component> comp = new LinkedList();
        MyFile comp1 = new MyFile(0);
        MyFile comp2 = new MyFile(1);
        Directory comp3 = new Directory(2);
        Directory comp4 = new Directory(3);
        comp.add(comp1);
        comp.add(comp2);
        comp.add(comp3);
        comp.add(comp4);
        
        comp3.add(comp1);        
        comp3.add(comp4);        
        comp4.add(comp2);

        
        comp.forEach(Component::printName);
        comp3.printContent();
    }
}
