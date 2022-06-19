package com.company;

public class Main {
    public static void main(String[] args) {
        String login = "Александр";
        String password = "alex3008";
        if ((args[0].equals(login)) && (args[1].equals(password))){
            System.out.println("Вас узнали. Добро пожаловать!");
        }
        else{
            System.out.println("Логин и пароль не распознаны. Доступ запрещен.");
        }
    }
}

