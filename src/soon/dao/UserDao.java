package soon.dao;

import soon.model.User;

import java.util.ArrayList;

public class UserDao {
    private final ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> getUsers(){
        return users;
    }
}
