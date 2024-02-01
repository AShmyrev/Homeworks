package org.example.homeworks.module_2.homework_3.ex1;

import java.time.LocalDateTime;
import java.util.*;

public class ReviewRunner {
    public static void run() {
        Comparator<Review> reviewComparator = (o1, o2) -> {
            if (o1.getLikesCounter() == o2.getLikesCounter()
                && o1.getReviewDateAndTime().isBefore(o2.getReviewDateAndTime())) {
                return 1;
            }
            return o2.getLikesCounter() - o1.getLikesCounter();
        };

        Set<Review> reviews = new TreeSet<>(reviewComparator);
        reviews.addAll(List.of(
                new Review(1, "отличный товар", 200,
                        LocalDateTime.of(2024, 1, 25, 13, 37)
                ),
                new Review(2, "так себе товар", 100,
                        LocalDateTime.of(2024, 1, 25, 16, 37)
                ),
                new Review(3, "плохой товар", 100,
                        LocalDateTime.of(2024, 1, 25, 13, 37)
                )
        ));

        System.out.println(reviews);
    }
}
