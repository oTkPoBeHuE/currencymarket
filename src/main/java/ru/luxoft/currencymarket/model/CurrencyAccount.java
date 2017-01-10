package ru.luxoft.currencymarket.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by xxoTk on 009 09.01.17.
 */
@Entity
public class CurrencyAccount implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Enumerated(EnumType.ORDINAL)
    private Currency currency;

    private BigDecimal amount;

    public CurrencyAccount() {

    }

    public CurrencyAccount(Currency currency, BigDecimal amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void add(BigDecimal amount) {
        amount.add(amount);
    }

    public void subtract(BigDecimal amount) {
        amount.subtract(amount);
    }


    public int CompareTo(BigDecimal amount){
        return this.amount.compareTo(amount);
    }


}
