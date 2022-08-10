package models;
import org.example.User;
import java.util.*;

public class InMemoryStorageUserManager implements UserManager {
    User user=new User(user);
    List<User> userList = new ArrayList<User>();

    @Override
    public ArrayList<User> addUser(User user) {
        userList.add(new User(user));
        return userList;
    }

    @Override
    public void updateUser () {
        ListIterator<User> userListIterator = userList.listIterator();
        while (userListIterator.hasNext()) {
            User existingUser = userListIterator.next();
            if (existingUser.getId() == user.getId()) {
                //userListIterator.set(user);
                existingUser.setName(user.getName());
            }
        }

    }
    @Override
    public List<User> listUsers () {
        return new ArrayList<User>();
    }
    @Override
    public boolean deleteUser(int id) {
        boolean flag=false;
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
    public boolean searchUsers(int searchId){
        ArrayList<User> searchlist = new ArrayList<User>();
        boolean flag = false;
        Iterator<User> userIterator = userList.iterator();
        while (userIterator.hasNext()) {
            User user = userIterator.next();
            if (user.getId() == searchId) {
                flag = true;
                searchlist.add(user);
                break;

            }
            else {
                flag = false;
            }
        }

        return flag;
    }
}