package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("q", "qq", (byte) 1);
        System.out.println("User с именем — q добавлен в базу данных ");
        userService.saveUser("w", "ww", (byte) 2);
        System.out.println("User с именем — w добавлен в базу данных ");
        userService.saveUser("e", "ee", (byte) 3);
        System.out.println("User с именем — e добавлен в базу данных ");
        userService.saveUser("r", "rr", (byte) 4);
        System.out.println("User с именем — r добавлен в базу данных ");
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
