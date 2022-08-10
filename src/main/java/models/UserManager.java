package models;

import com.org.example.User;
import org.example.User;

import java.util.ArrayList;
import java.util.List;

public interface UserManager {


    ArrayList<User> addUser(User user);

    void addUser(int id, String firstName, String lastName);

    void updateUser();

    List<User> listUsers();

    boolean deleteUser(int id);

    List<User> searchUser(int id);

    boolean deleteUser();

    List<User> searchUsers(int id);
}
