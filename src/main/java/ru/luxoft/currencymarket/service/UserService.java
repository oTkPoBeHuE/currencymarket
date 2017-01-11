package ru.luxoft.currencymarket.service;

import ru.luxoft.currencymarket.model.User;

import java.util.List;

/**
 * Created by xxoTk on 011 11.01.17.
 */
public interface UserService {

    User findById(int id);

    User findBySSO(String sso);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserBySSO(String sso);

    List<User> findAllUsers();

    boolean isUserSSOUnique(Integer id, String sso);
}
