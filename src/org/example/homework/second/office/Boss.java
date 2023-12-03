package org.example.homework.second.office;

public class Boss {
    private String name;

    public Boss(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void hurryManager(Manager manager) {
        System.out.println(manager.getName() + ", быстрее!");
    }
}
