package ru.luxoft.currencymarket.model;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xxoTk on 009 09.01.17.
 */
public interface UserJpaRepository extends JpaRepository<User, Integer> {
    User findByName(String name);
}
