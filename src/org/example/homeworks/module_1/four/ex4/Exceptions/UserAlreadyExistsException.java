package org.example.homeworks.module_1.four.ex4.Exceptions;

public class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException() {
        super("Error: User with this name already exists!\n");
    }
}
