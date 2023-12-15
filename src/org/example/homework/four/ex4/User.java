package org.example.homework.four.ex4;

import org.example.homework.four.ex4.Exceptions.ListOfMessagesOverflowException;

public class User {
    private String name;
    private String password;
    private Message[] messages;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.messages = new Message[100];
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Message[] getMessages() {
        return messages;
    }

    public void addMessage(Message message) throws ListOfMessagesOverflowException {
        if (messages[messages.length - 1] != null) {
            throw new ListOfMessagesOverflowException();
        }
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] == null) {
                messages[i] = message;
                break;
            }
        }
    }


}
