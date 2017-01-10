package ru.luxoft.currencymarket.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xxoTk on 009 03.01.17.
 * ISO 4217 current Code  RUB
 */
public enum Currency implements Serializable {
    EURO("EUR", "€"), UnitedStatesDollar("USD", "$"), RussianRuble("RUB", "\u20BD");

    private Map<Currency, Double> rates = new HashMap();

    private String code;
    private String symbol;

    Currency(String code, String symbol) {
        this.code = code;
        this.symbol = symbol;
    }

    public String getCode() {
        return code;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return code;
    }

    public void setRate(Currency currency, Double rate) {
        rates.put(currency, rate);
    }

    public Double getRate(Currency currency) {
        return rates.get(currency);
    }
}
