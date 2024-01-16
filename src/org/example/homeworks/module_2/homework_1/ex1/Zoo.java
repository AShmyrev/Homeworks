package org.example.homeworks.module_2.homework_1.ex1;

public class Zoo <T, D, B> {
    private T tiger;
    private D dog;
    private B bird;

    public Zoo(T tiger, D dog, B bird) {
        this.tiger = tiger;
        this.dog = dog;
        this.bird = bird;
    }

    public T getTiger() {
        return tiger;
    }

    public void setTiger(T tiger) {
        this.tiger = tiger;
    }

    public D getDog() {
        return dog;
    }

    public void setDog(D dog) {
        this.dog = dog;
    }

    public B getBird() {
        return bird;
    }

    public void setBird(B bird) {
        this.bird = bird;
    }
}
