package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    User getUserById(int id);
    List<User> getAllUsers();
    void save(User user);
    void update(User user);
    void delete(int id);



}
