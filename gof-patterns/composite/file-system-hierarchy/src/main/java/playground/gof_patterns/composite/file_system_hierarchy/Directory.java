package playground.gof_patterns.composite.file_system_hierarchy;

import java.util.LinkedList;
import java.util.List;

public class Directory extends Component {

    private List<Component> content = new LinkedList<>();

    Directory(int id) {
        super(id);
    }

    void add(Component component) {
        content.add(component);
    }

    void printContent() {
        String msg = String.format("Content of %s :", getName());
        System.out.println(msg);
        content.forEach(Component::printName);
    }

}
