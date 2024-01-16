package org.example.homeworks.module_1.four.ex4.Exceptions;

public class IllegalOperationWhenLoggedInException extends Throwable {
    public IllegalOperationWhenLoggedInException() {
        super("Error: You cannot do this when you logged in!\n");
    }
}
