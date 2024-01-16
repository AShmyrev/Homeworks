package org.example.homeworks.module_1.four.ex4.Exceptions;

public class ListOfMessagesEmptyException extends Throwable {
    public ListOfMessagesEmptyException() {
        super("Error: List of messages are empty!\n");
    }
}
