package org.example;

import models.InMemoryStorageUserManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Userdetails {
    public static void main(String[] args) {
        Scanner integerInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);


        InMemoryStorageUserManager userManager = new InMemoryStorageUserManager();
        int ch = 0;
        do {
            System.out.println("enter your choice");
            System.out.println("1.Adduser");
            System.out.println("2.delete user");
            System.out.println("3.list users");
            System.out.println("4.Update users");
            System.out.println("5.Search user");
            System.out.println("6.exit");
            ch = integerInput.nextInt();

            if (ch == 1) {
                User user = new User();
                System.out.println("enter user id ");
                user.setId(integerInput.nextInt());
                System.out.println("enter user name");
                user.setName(stringInput.nextLine());
                System.out.println("enter user email");
                user.setEmail(stringInput.nextLine());
                userManager.addUser(user);
            } else if (ch == 2) {
                User user = new User();
                System.out.println("enter Id to be deleted");
                int deleteId = integerInput.nextInt();
                boolean flag = userManager.deleteUser(deleteId);

                if (flag == true) {

                    System.out.println(user);
                } else {
                    System.out.println("not found");
                }

            } else if (ch == 3) {
                System.out.println(userManager.listUsers());

            } else if (ch == 4) {

                User user = new User();
                System.out.println("enter user id to be updated ");
                user.setId(integerInput.nextInt());
                System.out.println("enter user name");
                user.setName(stringInput.nextLine());
                System.out.println("enter user email");
                user.setEmail(stringInput.nextLine());
                userManager.updateUser(user);


            } else if (ch == 5) {
                System.out.println("enter user id to search");
                int searchId = integerInput.nextInt();
                System.out.println(userManager.searchUser(searchId));

            } else {
                ch = 6;
            }
        } while (ch != 6);


    }

}
