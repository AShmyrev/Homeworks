package org.example.homeworks.module_2.homework_4.ex2;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class RunnerO {
    public static void main(String[] args) {
        Set<String> uniqueWords = Set.of("тонь", "тополь", "боль", "рой", "стройка");

        System.out.println(getCount(uniqueWords));
//        getCountsO(uniqueWords).forEach(System.out::println);
    }

    private static long getCount(Set<String> stringsSet) {
        return stringsSet.stream()
                .map(word -> word.chars().filter(ch -> 'о' == ch).count())
                .reduce(0L, Long::sum);
    }

    private static List<Long> getCountsO(Set<String> stringsSet) {
        return stringsSet.stream()
                .map(word -> word.chars().filter(el -> 'о' == el).count())
                .collect(Collectors.toList());
    }

//    private static long getCountByOptional() {
//        Optional<Set<String>> setOptional = Optional.of(uniqueWords)
//                .filter(word -> word.chars().filter(el -> 'о' == el).count()) // ?????
//                .map(word -> word.chars().filter(el -> 'о' == el).count()) // ?????
//
//        // anyMatch ? Optional
//    }
}
