package org.example.homework.second.shop;

import java.util.Arrays;

public class Shop {
    private Worker[] workers;

    public Shop(Worker[] workers) {
        this.workers = workers;
    }

    public void printWorkers() {
        if (workers.length == 0) {
            System.out.println("В магазине нет работников!");
            return;
        }
        for (Worker worker : workers) {
            System.out.println(worker.getName() + ": " + worker.getAge() + " лет, " + worker.getSex()
                    + ", список вещей: " + Arrays.toString(worker.getItems()));
        }
    }

    public Worker[] getWorkers() {
        return workers;
    }
}
