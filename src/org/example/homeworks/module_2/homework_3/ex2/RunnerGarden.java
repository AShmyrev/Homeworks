package org.example.homeworks.module_2.homework_3.ex2;

public class RunnerGarden {
    public static void run() {
        Apple apple = new Apple();
        Apricot apricot = new Apricot();
        Garden<Apple> appleGarden = () -> new Apple();
        Garden<Apricot> apricotGarden = () -> new Apricot();
        Apple appleFromGarden = appleGarden.get();
        Apricot apricotFromGarden = apricotGarden.get();    
    }
}
