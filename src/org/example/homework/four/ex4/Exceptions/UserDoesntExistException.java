package org.example.homework.four.ex4.Exceptions;

public class UserDoesntExistException extends Exception {
    public UserDoesntExistException() {
        super("Error: There is no user with this name!\n");
    }
}
