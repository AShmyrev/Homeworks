package org.example.homeworks.module_2.homework_3.ex5;

public class RunnerRuler {
    public static void run() {
        Ruler<Boat> boatRuler = boat -> boat.getLength();
        Ruler<Animal> animalRuler = animal ->
                animal.getBodyLength() + animal.getTailLength();
    }
}
