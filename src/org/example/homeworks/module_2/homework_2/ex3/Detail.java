package org.example.homeworks.module_2.homework_2.ex3;

import java.util.Objects;

public class Detail {
    private String name;

    public Detail(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() == o.getClass()) return true;
        Detail detail = (Detail) o;
        return Objects.equals(name, detail.name);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "name='" + name + '\'' +
                '}';
    }
}
