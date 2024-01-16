package org.example.homeworks.module_1.four.ex4.Exceptions;

public class ListOfMessagesOverflowException extends Throwable {
    public ListOfMessagesOverflowException() {
        super("Error: Cannot write message: list of messages overflow.\n");
    }
}
