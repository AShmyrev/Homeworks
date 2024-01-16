package org.example.homeworks.module_1.second.office;

public class Guard {
    private String name;

    public Guard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void askForMoney() {
        System.out.println("Дайте аванс");
    }
}
