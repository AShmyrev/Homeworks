package org.example.homeworks.module_2.homework_2.ex1;

import java.util.List;

public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void throwSuitcase(List<Suitcase> suitcases) {
        System.out.println(this.name + ": Мужики, кидаю чемодан " + suitcases.remove(0).getFlightNumber());
    }
}
