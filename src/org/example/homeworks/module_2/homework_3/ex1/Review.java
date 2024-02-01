package org.example.homeworks.module_2.homework_3.ex1;

import java.time.LocalDateTime;

public class Review {
    private int id;
    private String text;
    private int likesCounter;
    private LocalDateTime reviewDateAndTime;

    public Review(int id, String text, int likesCounter) {
        this.id = id;
        this.text = text;
        this.likesCounter = likesCounter;
        this.reviewDateAndTime = LocalDateTime.now();
    }

    public Review(int id, String text, int likesCounter, LocalDateTime reviewDateAndTime) {
        this.id = id;
        this.text = text;
        this.likesCounter = likesCounter;
        this.reviewDateAndTime = reviewDateAndTime;
    }

    public int getLikesCounter() {
        return likesCounter;
    }

    public LocalDateTime getReviewDateAndTime() {
        return reviewDateAndTime;
    }

    @Override
    public String toString() {
        return "Отзыв №" + id +
                ": id=" + id +
                ", text='" + text + '\'' +
                ", likesCounter=" + likesCounter +
                ", reviewDateAndTime=" + reviewDateAndTime +
                '}' +
                '\n';
    }
}
