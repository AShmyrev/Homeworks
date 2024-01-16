package org.example.homeworks.module_1.four.ex1;

public class CarWash {
    public static final int PRICE_FOR_LARGE_AUTO = 4000;
    public static final int PRICE_FOR_SMALL_AUTO = 2000;

    public int wash(Car car) {
        car.setClean(true);
        if (car.getLength() > 6 || car.getHeight() > 2.5 || car.getWidth() > 2) {
            return PRICE_FOR_LARGE_AUTO;
        } else {
            return PRICE_FOR_SMALL_AUTO;
        }
    }

    public int wash(Car[] cars) {
        int totalPrice = 0;
        for (Car car : cars) {
            totalPrice += wash(car);
        }
        return totalPrice;
    }
}
