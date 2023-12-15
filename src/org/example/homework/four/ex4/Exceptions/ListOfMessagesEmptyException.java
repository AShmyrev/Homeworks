package org.example.homework.four.ex4.Exceptions;

public class ListOfMessagesEmptyException extends Throwable {
    public ListOfMessagesEmptyException() {
        super("Error: List of messages are empty!\n");
    }
}
