package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    User getUserById(int id);
    List<User> getAllUsers();
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
}