package org.example.homework.four.ex2;

public class Airplane implements Flyable {
    private int passengersCount;

    public Airplane(int passengersCount) {
        this.passengersCount = passengersCount;
    }

    @Override
    public void fly() throws FlyException {
        if (this.passengersCount < 0) {
            throw new FlyException("пассажиров в самолете меньше 0");
        }
        System.out.println("самолет летит");
    }
}
