package org.example.homework.four.ex3;

public class Bird implements SoundMaker {
    private static final String BIRD_SOUND = "Чирик";

    @Override
    public String makeSound() {
        return BIRD_SOUND;
    }
}
