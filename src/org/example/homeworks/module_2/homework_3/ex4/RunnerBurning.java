package org.example.homeworks.module_2.homework_3.ex4;

public class RunnerBurning {
    public static void run() {
        Burning<Uranus> atomicReactor = uranus -> System.out.println("зеленый свет вокруг!");
        Burning<Wood> bonfire = wood -> System.out.println("желто-красный свет вокруг!");
    }
}
