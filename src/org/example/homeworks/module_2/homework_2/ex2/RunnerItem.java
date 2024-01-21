package org.example.homeworks.module_2.homework_2.ex2;

import java.util.HashMap;

public class RunnerItem {
    public static void run() {
        HashMap<Item, Integer> map = new HashMap<>();
        Item apple = new Item("Яблоко"),
            banana = new Item("Банан"),
            orange = new Item("Апельсин");
        map.put(apple, 1);
        map.put(banana, 2);
        map.put(orange, 3);
        System.out.println(map);
        System.out.println(map.get(apple));
        System.out.println(map.get(banana));
        System.out.println(map.get(orange));
    }
}
