package org.example.homework.third.ex2;

public class OperationSystem {
    private String name;

    public OperationSystem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return '\'' + name + '\'';
    }
}
