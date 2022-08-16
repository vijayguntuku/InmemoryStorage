package models;

import org.example.User;

import java.util.*;

public class InMemoryStorageUserManager implements UserManager {
    List<User> userList = new ArrayList<User>();

    @Override
    public List<User> addUser(User user) {
        userList.add(user);
        return userList;
    }

    @Override
    public void updateUser(User user) {
        ListIterator<User> userListIterator = userList.listIterator();
        while (userListIterator.hasNext()) {
            User existingUser = userListIterator.next();
            if (existingUser.getId() == user.getId()) {
                existingUser.setName(user.getName());
                existingUser.setEmail(user.getEmail());
            } else {
                System.out.println("User not found");
            }

        }

    }

    @Override
    public List<User> listUsers() {
        return userList;
    }

    @Override
    public boolean deleteUser(int id) {
        User user = searchUser(id);
        boolean flag = false;
        Iterator<User> userIterator = userList.iterator();
        while (userIterator.hasNext()) {
            User userObject = userIterator.next();
            if (userObject.getId() == user.getId()) {
                flag = true;
                userIterator.remove();
                break;
            }
        }
        return flag;
    }


    @Override
    public User searchUser(int searchId) {
        for (User user : userList) {
            if (user.getId() == searchId) {
                return user;
            }
        }
        return null;
    }
}