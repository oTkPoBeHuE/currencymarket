package ru.luxoft.currencymarket.dao;

import ru.luxoft.currencymarket.model.User;

import java.util.List;

/**
 * Created by xxoTk on 011 11.01.17.
 */
public interface UserDao {

    User findById(int id);

    User findBySSO(String sso);

    void save(User user);

    void deleteBySSO(String sso);

    List<User> findAllUsers();
}
