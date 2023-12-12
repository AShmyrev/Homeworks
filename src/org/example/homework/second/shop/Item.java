package org.example.homework.second.shop;

public class Item {
    private String name;
    private int weight;

    public String getName() {
        return name;
    }

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "'" + name + '\''
                + ", weight=" + weight;
    }
}
