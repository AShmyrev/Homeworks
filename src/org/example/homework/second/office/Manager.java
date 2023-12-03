package org.example.homework.second.office;

public class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void shout() {
        System.out.println("я ничего не успеваю, помогите!");
    }
}
