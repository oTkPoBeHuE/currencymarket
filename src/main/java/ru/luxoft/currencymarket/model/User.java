package ru.luxoft.currencymarket.model;

//import javax.persistence.*;
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by xxoTk on 009 09.01.17.
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

   // @Column(unique = true)
    private String name;

    private String password;


//    //// TODO: 009 01.01.17 поменять на FetchType.LAZY
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<CurrencyAccount> accounts = new ArrayList<>();


    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public List<CurrencyAccount> getAccounts() {
//        return accounts;
//    }
//
//    public void setAccounts(List<CurrencyAccount> accounts) {
//        this.accounts = accounts;
//    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
