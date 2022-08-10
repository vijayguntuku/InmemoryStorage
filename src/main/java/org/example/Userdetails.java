package org.example;

import models.InMemoryStorageUserManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Userdetails  {
    public static void main(String[] args) {
        Scanner integerInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        User userInput = null;

        userInput = new User(userInput.getId(), userInput.getName(),userInput.getEmail());

        ArrayList<User> UserList = new ArrayList<>() ;
      InMemoryStorageUserManager userManager = new InMemoryStorageUserManager();
        int ch = 0;
        do{
            System.out.println("enter your choice");
            System.out.println("1.Adduser");
            System.out.println("2.delete user");
            System.out.println("3.list users");
            System.out.println("4.Update users");
            System.out.println("5.Search user");
            System.out.println("6.exit");

            if(ch == 1){
                System.out.println("enter user id ");
                userInput.setId(integerInput.nextInt());
                System.out.println("enter user name");
                userInput.setName(stringInput.nextLine());
                System.out.println("enter user email");
                userInput.setEmail(stringInput.nextLine());

                UserList.add(new User(userInput.getId(),userInput.getName(),userInput.getEmail()));
                userManager.addUser(userInput);
            }
            else if (ch ==2) {
                System.out.println("enter Id to be deleted");
                boolean flag = userManager.deleteUser(userInput.getId());

                if(flag == true){
                    System.out.println(UserList);
                }else {
                    System.out.println("not found");
                }

            }
            else if (ch == 3) {
                System.out.println("users list");
                userManager.listUsers();

            } else if (ch ==4) {
                System.out.println("enter user Id to be updated");
                userManager.updateUser();
            } else if (ch == 5) {
                System.out.println("enter user id to search");
                boolean flag;
                int searchId = integerInput.nextInt();
                flag = userManager.searchUser(searchId);

                if(flag == true){
                    System.out.println(ser);
                }else {
                    System.out.println("not found");
                }



            }else {
                ch=6;
            }
        }while(ch!=6);


    }

}
