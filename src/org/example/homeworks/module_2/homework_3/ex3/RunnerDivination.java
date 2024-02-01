package org.example.homeworks.module_2.homework_3.ex3;

public class RunnerDivination {
    public static void run() {
        Divination<Chamomile> chamomileDivination = chamomile ->
                chamomile.getName().length() % 2 == 0;
        Divination<Human> fortuneTeller = human ->
                human.getAge() + human.getHeight() > 210;
    }
}
