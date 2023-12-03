package org.example.homework.second.office;

public class Runner {
    public static void run() {
        Boss boss = new Boss("Петр Николаевич");
        Manager manager = new Manager("Володя");
        Guard guard = new Guard("Петрович");
        Secretary secretary = new Secretary();

        Office office = new Office(boss, manager, secretary, guard);

        office.boss.hurryManager(office.getManager());
        office.manager.shout();
        office.guard.askForMoney();
        office.secretary.doJob(boss, manager, guard);
    }
}