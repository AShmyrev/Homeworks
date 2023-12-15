package org.example.homework.four.ex3;

public class Builder extends Human {
    private static final String BUILDER_SOUND = "Я строитель.";

    @Override
    public String makeSound() {
        return BUILDER_SOUND + " " + super.makeSound();
    }
}
