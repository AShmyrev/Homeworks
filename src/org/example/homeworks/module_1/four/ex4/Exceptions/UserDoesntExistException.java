package org.example.homeworks.module_1.four.ex4.Exceptions;

public class UserDoesntExistException extends Exception {
    public UserDoesntExistException() {
        super("Error: There is no user with this name!\n");
    }
}
