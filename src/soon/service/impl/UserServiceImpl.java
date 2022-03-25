package soon.service.impl;

import soon.dao.UserDao;
import soon.model.User;
import soon.service.UserService;

import java.util.ArrayList;
import java.util.Arrays;


public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDao();

    @Override
    public void addUsers(User user) {
        if(userDao.getUsers().stream().anyMatch(x->x.getId()==user.getId())){
            throw new RuntimeException("ID unikalduu bolush kerek siz bergen ID:"+user.getId()+" uje Data basede bar!");
        }else{
            userDao.getUsers().add(user);
        }

    }

    @Override
    public void findUserWithID(int id) {
        ArrayList<User> users = userDao.getUsers();
       if( users.stream().anyMatch(x->x.getId()==id)){
           System.out.println(users.stream().filter(x->x.getId()==id).findFirst().get());
       }else{
           throw new RuntimeException("ID:"+id+" bazada jok!");
       }

    }

    @Override
    public void removeUserWithID(int id) {
        ArrayList<User> users = userDao.getUsers();

        if(users.stream().anyMatch(x->x.getId()==id)){  // berilgen id bazada barby teksherip atat!
            users.removeIf(x->x.getId()==id);    // berilgen id ni bazadan ochurup jatat
            System.out.println("ID:"+id+" is removed from base!");

        }else{
            throw new RuntimeException("ID:"+id+" bazada jok!");


        }


    }

    @Override
    public void getAllUsers() {
        ArrayList<User> users = userDao.getUsers();
        System.out.println(users);


    }
}
