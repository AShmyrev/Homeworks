package org.example.homework.four.ex4;

import java.util.Scanner;
import org.example.homework.four.ex4.Exceptions.UserAlreadyExistsException;
import org.example.homework.four.ex4.Exceptions.UserDoesntExistException;
import org.example.homework.four.ex4.Exceptions.UserIncorrectPasswordException;

public class OneGramChatTest {

    public static Scanner console = new Scanner(System.in);
    private static final String WELCOME_MESSAGE = "Welcome to the OneGram Chat!";
    private User[] users = new User[10];
    private User currentLoggedInUser;
    private static final String NAVIGATE_MESSAGE = """
            to navigate the chat use following commands:
            "войти" - запуск функции "войти пользователю"
            "новый" - запуск функции "создать пользователя"
            "выйти" - запуск функции "выйти пользователю"
            "написать" - запуск функции "написать письмо"
            "прочитать" - запуск функции "прочитать письмо"
            "exit" - окончание работы программы;
            """;

    public void run() {
        System.out.println(WELCOME_MESSAGE + "\n" + NAVIGATE_MESSAGE);
        String userInput = console.nextLine();
        while (!userInput.equals("exit")) {
            if (currentLoggedInUser == null) {
                runAsGuest(userInput);
            } else {
                runAsUser(userInput);
            }
            System.out.println(NAVIGATE_MESSAGE);
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
//            case "выйти": System.out.println("переход в выйти");
//                break;
//            case "написать": System.out.println("переход в написать");
//                break;
//            case "прочитать": System.out.println("переход в прочитать");
//                break;
            default:
                System.out.println("Неверный ввод!");
        }
    }

    private void runAsUser(String userInput) {
        switch (userInput) {
            case "выйти": System.out.println("переход в выйти");
                break;
            case "написать": System.out.println("переход в написать");
                break;
            case "прочитать": System.out.println("переход в прочитать");
                break;
            default:
                System.out.println("Неверный ввод!");
        }
    }
}

