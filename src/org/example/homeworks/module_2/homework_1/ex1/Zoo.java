package org.example.homeworks.module_2.homework_1.ex1;

import java.util.LinkedList;

public class Zoo <T extends Animal, D extends Animal, B extends Animal> {
    private T animal1;
    private D animal2;
    private B animal3;

    public Zoo(T animal1, D animal2, B animal3) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.animal3 = animal3;
    }

    public T getAnimal1() {
        return animal1;
    }

    public void setAnimal1(T animal1) {
        this.animal1 = animal1;
    }

    public D getAnimal2() {
        return animal2;
    }

    public void setAnimal2(D animal2) {
        this.animal2 = animal2;
    }

    public B getAnimal3() {
        return animal3;
    }

    public void setAnimal3(B animal3) {
        this.animal3 = animal3;
    }
}
