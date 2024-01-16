package org.example.homeworks.module_2.homework_1.ex1;

public class RunnerZoo {
    public static void run() {
        Tiger tiger = new Tiger();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Zoo<Tiger, Dog, Bird> zoo = new Zoo<Tiger, Dog, Bird>(tiger, dog, bird);
        zoo.getTiger().roar();
        zoo.getDog().bark();
        zoo.getBird().fly();
    }
}
