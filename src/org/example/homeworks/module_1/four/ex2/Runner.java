package org.example.homeworks.module_1.four.ex2;

public class Runner {
    public static void run() {
        Flyable[] flyables = {
            new Duck(false),
            new Duck(true),
            new Airplane(10),
            new Airplane(-1)
        };
        for (Flyable flyable : flyables) {
            try {
                flyable.fly();
            } catch (FlyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
