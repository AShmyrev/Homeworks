package org.example.homeworks.module_2.homework_4.ex3;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RunnerSkyscrapers {
    public static void main(String[] args) {
        List<Skyscraper> skyscrapers = List.of(
                new Skyscraper("Всемирный торговый центр", 541),
                new Skyscraper("Шанхайская башня", 632),
                new Skyscraper("Бурдж-Халифа", 828),
                new Skyscraper("Бурдж-Халифа", 828),
                new Skyscraper("Международный финансовый центр Пинань", 599),
                new Skyscraper("Абрадж аль-Бейт", 601),
                new Skyscraper("Всемирный центр Лотте", 555)
        );

        List<Skyscraper> uniqueSkyscrapers = skyscrapers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueSkyscrapers);

        uniqueSkyscrapers.stream()
                .limit(3)
                .forEach(System.out::println);

        Skyscraper theHighestSkyscraper = uniqueSkyscrapers.stream()
                .max((el1, el2) -> el1.getLength() - el2.getLength())
                .get();
        System.out.println("The highest skyscraper is " + theHighestSkyscraper);

//        Optional<List<Skyscraper>> optionalSkyscrapers = Optional.of(skyscrapers);
//        optionalSkyscrapers.filter(skyscraper -> skyscraper.)
//        uniqueSkyscrapers.stream()
//                .ifPresent()
//                .filter(el -> el.getLength() > 1000); // Optional orElse?
    }
}
