package org.example.homeworks.module_1.four.ex4;

import java.util.Scanner;
import org.example.homeworks.module_1.four.ex4.Exceptions.*;

public class OneGramChatTest {

    public static Scanner console = new Scanner(System.in);
    private static final String WELCOME_MESSAGE = "Welcome to the OneGram Chat!";
    private User[] users = new User[10];
    private User currentLoggedInUser;
    private static final String NAVIGATE_MESSAGE_GUEST = """
            to navigate the chat use following commands:
            "войти" - запуск функции "войти пользователю"
            "новый" - запуск функции "создать пользователя"
            "exit" - окончание работы программы;
            """;
    private static final String NAVIGATE_MESSAGE_USER = """
            to navigate the chat use following commands:
            "написать" - запуск функции "написать письмо"
            "прочитать" - запуск функции "прочитать письмо"
            "выйти" - запуск функции "выйти пользователю"
            "exit" - окончание работы программы;
            """;

    public void run() {
        System.out.println(WELCOME_MESSAGE + "\n" + NAVIGATE_MESSAGE_GUEST);
        String userInput = console.nextLine();
        while (!userInput.equals("exit")) {
            if (currentLoggedInUser == null) {
                runAsGuest(userInput);
            } else {
                runAsUser(userInput);
            }
            if (currentLoggedInUser == null) {
                System.out.println(NAVIGATE_MESSAGE_GUEST);
            } else {
                System.out.println(NAVIGATE_MESSAGE_USER);
            }
            userInput = console.nextLine();
        }
    }

    public void signUp() throws UserAlreadyExistsException {
        System.out.println("Enter your name:");
        String userName = console.nextLine();
        System.out.println("Enter your password:");
        String userPassword = console.nextLine();
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getName().equals(userName)) {
                throw new UserAlreadyExistsException();
            }
            if (users[i] == null) {
                users[i] = new User(userName, userPassword);
                currentLoggedInUser = users[i];
                System.out.println("You have signed up successfully!\n"
                        + "Welcome, " + currentLoggedInUser.getName() + "!");
                break;
            }
        }
    }

    public void login() throws UserDoesntExistException, UserIncorrectPasswordException {
        System.out.println("Enter your name:");
        String userName = console.nextLine();
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                throw new UserDoesntExistException();
            }
            if (users[i].getName().equals(userName)) {
                System.out.println("Enter you password:");
                String userPassword = console.nextLine();
                if (!(users[i].getPassword().equals(userPassword))) {
                    throw new UserIncorrectPasswordException();
                } else {
                    System.out.println("Welcome, " + users[i].getName() + "!");
                    currentLoggedInUser = users[i];
                    break;
                }
            }
        }
    }

    private void runAsGuest(String userInput) {
        switch (userInput) {
            case "войти":
                try {
                    login();
                } catch (UserDoesntExistException | UserIncorrectPasswordException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "новый":
                try {
                    signUp();
                } catch (UserAlreadyExistsException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Неверный ввод!");
        }
    }

    private void runAsUser(String userInput) {
        switch (userInput) {
            case "выйти": logout();
                break;
            case "написать":
                try {
                    writeMessage();
                } catch (UserDoesntExistException | ListOfMessagesOverflowException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "прочитать":
                try {
                    readAllMessages();
                } catch (ListOfMessagesEmptyException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Неверный ввод!");
        }
    }

    private void logout() {
        System.out.println("You have been logged out!");
        currentLoggedInUser = null;
    }

    private void writeMessage() throws UserDoesntExistException, ListOfMessagesOverflowException {
        if (isMessagesListFull(currentLoggedInUser.getMessages())) {
            throw new ListOfMessagesOverflowException();
        }
        System.out.println("Enter user name to write a message:");
        String usernameToWrite = console.nextLine();
        User userToWrite = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                throw new UserDoesntExistException();
            }
            if (users[i].getName().equals(usernameToWrite)) {
                System.out.println("User has found");
                userToWrite = users[i];
                break;
            }
        }
        if (userToWrite == null) {
            throw new UserDoesntExistException();
        }
        System.out.println("Write a message:");
        String userMessageText = console.nextLine();
        currentLoggedInUser.addMessage(new Message(userMessageText, false, userToWrite.getName()));
        userToWrite.addMessage(new Message(userMessageText, true, currentLoggedInUser.getName()));
        System.out.println("Message has been sent!");
    }

    private boolean isMessagesListFull(Message[] messages) {
        return messages[messages.length - 1] != null;
    }

    private boolean isMessagesListEmpty(Message[] messages) {
        return messages[0] == null;
    }

    private void readAllMessages() throws ListOfMessagesEmptyException {
        if (isMessagesListEmpty(currentLoggedInUser.getMessages())) {
            throw new ListOfMessagesEmptyException();
        }
        for (Message message : currentLoggedInUser.getMessages()) {
            if (message == null) {
                break;
            }
            if (message.isIncoming()) {
                System.out.printf("письмо от %s: %s\n", message.getToOrFromWhom(), message.getText());
            } else {
                System.out.printf("письмо к %s: %s\n", message.getToOrFromWhom(), message.getText());
            }
        }
    }
}

