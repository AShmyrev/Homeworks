package org.example.homeworks.module_1.four.ex2;

public class FlyException extends Exception {
    public FlyException(String message) {
        super("Ошибка: " + message);
    }
}
