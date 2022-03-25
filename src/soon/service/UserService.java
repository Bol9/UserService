package soon.service;

import soon.model.User;

public interface UserService {
    void addUsers(User user);
    void findUserWithID(int id);
    void removeUserWithID(int id);
    void getAllUsers();


}
