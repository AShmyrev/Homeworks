package org.example.homeworks.module_1.third.ex2;

public class Board {
    private String name;
    private int width;
    private int length;
    private int height;

    public Board(String name, int width, int length, int height) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    public String toString() {
        return "{"
                + "name='" + name + '\''
                + ", size=" + width
                + "x" + length
                + "x" + height
                + '}';
    }
}
