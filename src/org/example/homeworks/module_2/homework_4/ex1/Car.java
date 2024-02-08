package org.example.homeworks.module_2.homework_4.ex1;

public class Car {
    private String number;

    public Car(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                '}';
    }
}
