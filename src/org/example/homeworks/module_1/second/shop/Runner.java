package org.example.homeworks.module_1.second.shop;

public class Runner {
    public static void run() {
        Item[] items = {
            new Item("hammer", 1000),
            new Item("screwdriver", 50),
            new Item("notebook", 30),
            new Item("pen", 10),
        };
        Worker[] workers = {
            new Worker("Василий", 30, Sex.MALE, new Item[]{items[0], items[1]}),
            new Worker("Марьяна", 25, Sex.FEMALE, new Item[]{items[2], items[3]})
        };

        Shop shop = new Shop(workers);
        shop.printWorkers();

        for (Worker worker : shop.getWorkers()) {
            worker.shout(shop.getWorkers());
        }
    }

}
