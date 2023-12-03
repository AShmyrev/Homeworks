package org.example.homework.second.shop;

public class Worker {
    private String name;
    private int age;
    private Sex sex;
    private Item[] items;

    public Worker(String name, int age, Sex sex, Item[] items) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        if (this.sex == Sex.MALE) {
            return "Мужчина";
        } else if (this.sex == Sex.FEMALE) {
            return "Женщина";
        } else {
            return "Пол неизвестен";
        }
    }

    public Item[] getItems() {
        return items;
    }

    public void shout(Worker[] workers) {
        if (workers.length == 0) {
            System.out.println("Некому хвастаться!");
            return;
        } else if (items.length == 0) {
            System.out.println("Нечем хвастаться!");
            return;
        }
        for (Worker worker : workers) {
            if (this == worker) {
                continue;
            }
            for (Item item : this.items) {
                System.out.println(worker.name + ": смотрите какая у меня вещь - " + item.getName());
            }
        }
    }
}
