package com.sample;

import models.InMemoryStorageUserManager;
import models.UserManager;
import org.example.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserManagertest {
    UserManager userManager = new InMemoryStorageUserManager();

    @Test
    public void addUser() {
        userManager.addUser(new User(1, "aditya", "vijay@gmail.com"));
        assertEquals(1, userManager.listUsers().size());
    }

    @Test
    public void updateUser() {
        userManager.addUser(new User(1, "aditya", "vijay@gmail.com"));
        userManager.updateUser(new User(1, "Vijay", "vij@gmail.com"));
        assertEquals(1, userManager.listUsers().size());

    }

        @Test
        public void listUsers() {
            userManager.addUser(new User(1, "aditya", "vijay@gmail.com"));
            userManager.listUsers();
            assertEquals(1, userManager.listUsers().size());


        }

        @Test
        public void deleteUser() {
            userManager.addUser(new User(1, "aditya", "vijay@gmail.com"));
            userManager.deleteUser(1);
            assertEquals(0, userManager.listUsers().size());

       }

        @Test
        public void searchUsers() {
            userManager.addUser(new User(1, "aditya", "vijay@gmail.com"));
            userManager.searchUser(1);
            assertEquals(1, userManager.listUsers().size());
        }
    }

