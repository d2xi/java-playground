package main.java.playground.gof_patterns.composite;

public abstract class Component {
    private int id;
    private String name;
    
    Component(int id) {
        this.id = id;
        this.name = ""+id;
    }

    void printName() {
        System.out.println(name);
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name.trim();
        }
    }
}
