package org.example.homework.four.ex4.Exceptions;

public class ListOfMessagesOverflowException extends Throwable {
    public ListOfMessagesOverflowException() {
        super("Error: Cannot write message: list of messages overflow.\n");
    }
}
