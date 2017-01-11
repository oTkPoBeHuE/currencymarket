package ru.luxoft.currencymarket.dao;

import ru.luxoft.currencymarket.model.User;

import java.util.List;

/**
 * Created by xxoTk on 011 11.01.17.
 */
public interface UserDao {

    User findById(int id);


    void save(User user);

    void deleteById(int id);

    List<User> findAllUsers();
}
