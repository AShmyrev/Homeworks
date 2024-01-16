package org.example.homeworks.module_1.four.ex4.Exceptions;

public class UserIncorrectPasswordException extends Exception {
    public UserIncorrectPasswordException() {
        super("Error: Incorrect password!\n");
    }
}
