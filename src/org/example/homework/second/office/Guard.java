package org.example.homework.second.office;

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
