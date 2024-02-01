package org.example.homeworks.module_2.homework_3.ex2;

@FunctionalInterface
public interface Garden<T extends Fruit> {
    T get();
}
