package org.example.homeworks.module_1.four.ex1;

public class Runner {

    public static void run() {
        CarWash carWash = new CarWash();
        int totalPriceForCityHall = carWash.wash(new PassengerCar[]{
            new PassengerCar(1.8, 2, 5),
            new PassengerCar(1.8, 2, 5),
            new PassengerCar(1.8, 2, 5),
            new PassengerCar(1.8, 2, 5)
        });
        totalPriceForCityHall += carWash.wash(new Bus[] {
            new Bus(2.3, 3, 12),
            new Bus(2.3, 3, 12),
            new Bus(2.3, 3, 12),
            new Bus(2.3, 3, 12),
            new Bus(2.3, 3, 12)
        });
        System.out.println(totalPriceForCityHall);
    }
}
