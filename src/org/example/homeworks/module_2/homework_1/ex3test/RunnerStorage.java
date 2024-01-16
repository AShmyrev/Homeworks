package org.example.homeworks.module_2.homework_1.ex3test;

import java.util.List;

public class RunnerStorage {
    public static void run() {
        //Склад
        Storage<Item> storage = new Storage<Item>();

        //Склад принимает в себя вещи.
        storage.addItem(new Item("1"));
        storage.printItems();

        //Склад умеет принимать в себя список вещей и хранить их с уже существующими вещами.
        storage.addItems(List.of(
                new Item("2"),
                new Item("3"),
                new Item("4"),
                new Item("5"),
                new Item("6"),
                new Item("7")
        ));
        storage.printItems();

        //В складе должен быть метод: получить все вещи.
        List<Item> evenItems = storage.getAllItems();
        for (Item item : evenItems) {
            System.out.println(item.getItemName());
        }
        System.out.println();

        //В складе должен быть метод: получить вещь по индексу. Данная вещь пропадает из склада.
        Item itemByIndex = storage.getItem(1);
        System.out.println(itemByIndex.getItemName());
        System.out.println();
        storage.printItems();

        //Склад умеет удалять все вещи, кроме последней.
        storage.removeAllExceptLast();
        storage.printItems();
    }
}
