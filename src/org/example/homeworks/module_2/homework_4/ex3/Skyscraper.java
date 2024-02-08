package org.example.homeworks.module_2.homework_4.ex3;

import java.util.Objects;

public class Skyscraper {
    private String name;
    private int length;

    public Skyscraper(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skyscraper that = (Skyscraper) o;
        return length == that.length && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, length);
    }

    @Override
    public String toString() {
        return "\nSkyscraper{" +
                "name='" + name + '\'' +
                ", length=" + length +
                '}';
    }
}
