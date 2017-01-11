package ru.luxoft.currencymarket.model;

//import javax.persistence.*;
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by xxoTk on 009 09.01.17.
 */
@Entity
@Table(name="APP_USER")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotEmpty
    @Column(name="NAME", nullable=false)
    private String name; //todo rename to login

    @NotEmpty
    @Column(name="PASSWORD", nullable=false)
    private String password;


//    //// TODO: 009 01.01.17  maybe change to FetchType.LAZY
      // TODO: 009 06.01.17 @JoinTable ??
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
