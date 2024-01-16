package org.example.homeworks.module_2.homework_1.ex1;

public class RunnerZoo {
    public static void run() {
        Tiger tiger = new Tiger();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Zoo<Tiger, Dog, Bird> zoo = new Zoo<Tiger, Dog, Bird>(tiger, dog, bird);
        zoo.getAnimal1().roar();
        zoo.getAnimal2().bark();
        zoo.getAnimal3().fly();
    }
}
