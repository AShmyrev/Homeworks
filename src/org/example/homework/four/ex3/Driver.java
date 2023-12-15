package org.example.homework.four.ex3;

public class Driver extends Human {
    private static final String DRIVER_SOUND = "Я водитель.";

    @Override
    public String makeSound() {
        return DRIVER_SOUND;
    }
}
