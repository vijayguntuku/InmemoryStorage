package models;

import org.example.User;
import org.example.User;

import java.util.List;

public interface UserManager {

    List<User> addUser(User user);

   void updateUser(User user);

     List<User> listUsers();

    boolean deleteUser(int id);

      User searchUser(int id);

}
