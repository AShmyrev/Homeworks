package org.example.homework.four.ex2;

public class FlyException extends Exception {
    public FlyException(String message) {
        super("Ошибка: " + message);
    }
}
