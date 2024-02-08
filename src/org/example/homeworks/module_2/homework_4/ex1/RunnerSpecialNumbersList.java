package org.example.homeworks.module_2.homework_4.ex1;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RunnerSpecialNumbersList {
    public static void main(String[] args) {
        String defaultNumber1FirstPart = "a0", defaultNumber1SecondPart = "ан799",
                defaultNumber2FirstPart = "к0", defaultNumber2SecondPart = "се178";
        List<Car> cars1 = createCars(defaultNumber1FirstPart, defaultNumber1SecondPart, 50);
        List<Car> cars2 = createCars(defaultNumber2FirstPart, defaultNumber2SecondPart, 50);
        Stream<Car> cars = concatCars(cars1, cars2);
//        printCars(cars.toList());
        List<Car> specialCars = getSpecialCars(cars);
//        printCars(specialCars);
        String finalString = getCarNumbers(specialCars);
        System.out.println(finalString);
    }

    private static List<Car> createCars(String defaultNumberFirstPart, String defaultNumberSecondPart, int limit) {
        AtomicInteger atomicInteger = new AtomicInteger();
        List<Car> cars = Stream.generate(() -> new Car(String.format(
                        "%s%02d%s", defaultNumberFirstPart, atomicInteger.addAndGet(1),
                        defaultNumberSecondPart)
                ))
                .limit(50)
                .collect(Collectors.toList());
        return cars;
    }

    private static void printCars(List<Car> cars) {
        cars.forEach(System.out::println);
    }

    private static Stream<Car> concatCars(List<Car> cars1, List<Car> cars2) {
        return Stream.concat(cars1.stream(), cars2.stream());
    }

    private static List<Car> getSpecialCars(Stream<Car> cars) {
        return cars.filter(car -> car.getNumber().contains("a04") || car.getNumber().contains("к04"))
                .collect(Collectors.toList());
    }

    private static String getCarNumbers(List<Car> cars) {
        return cars.stream().map(Car::getNumber)
                .collect(Collectors.joining(", "));
    }
}
