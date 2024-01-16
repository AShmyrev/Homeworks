package org.example.homeworks.module_1.four.ex4.Exceptions;

public class IllegalOperationWhenLoggedOutException extends Throwable {
    public IllegalOperationWhenLoggedOutException() {
        super("Error: You cannot do this when you logged out!\n");
    }
}
