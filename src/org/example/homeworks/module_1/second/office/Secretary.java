package org.example.homeworks.module_1.second.office;

public class Secretary {
    public void doJob(Boss boss, Manager manager, Guard guard) {
        System.out.println(boss.getName() + ", не волнуйтесь, " + manager.getName() + " все успеет. "
                + guard.getName() + " - подождите!");
    }
}
