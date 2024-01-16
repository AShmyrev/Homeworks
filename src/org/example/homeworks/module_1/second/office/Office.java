package org.example.homeworks.module_1.second.office;

public class Office {
    Boss boss;
    Manager manager;
    Secretary secretary;
    Guard guard;

    public Office(Boss boss, Manager manager, Secretary secretary, Guard guard) {
        this.boss = boss;
        this.manager = manager;
        this.secretary = secretary;
        this.guard = guard;
    }

    public Manager getManager() {
        return manager;
    }
}
