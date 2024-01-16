package org.example.homeworks.module_2.homework_1.ex2;

import java.util.ArrayList;
import java.util.List;

public class RunnerList {
    public static void run() {
        ArrayList<Integer> list1 = new ArrayList<Integer>(List.of(5, 2, 4));
        ArrayList<Integer> list2 = new ArrayList<Integer>(List.of(7, 10));
        ArrayList<Integer> list3 = new ArrayList<Integer>(list1);
        list3.addAll(list2);
        list3.remove(2);
        System.out.println(list3.indexOf(10));
    }
}
