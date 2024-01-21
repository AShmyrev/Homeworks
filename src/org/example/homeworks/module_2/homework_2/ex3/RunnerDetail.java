package org.example.homeworks.module_2.homework_2.ex3;

import java.util.HashMap;

public class RunnerDetail {
    public static void run() {
        HashMap<Detail, Integer> map = new HashMap<>();
        Detail saw = new Detail("Пила");
        Detail hammer = new Detail("Молоток");
        Detail screwdriver = new Detail("отвертка");
        map.put(saw, 1);
        map.put(hammer, 2);
        map.put(screwdriver, 3);
        System.out.println(map);
    }
}
