package ru.luxoft.currencymarket.service;

import ru.luxoft.currencymarket.model.User;

import java.util.List;

/**
 * Created by xxoTk on 011 11.01.17.
 */
public interface UserService {

    User findById(int id);

    void saveUser(User user);

    void updateUser(User user);

    List<User> findAllUsers();
}
