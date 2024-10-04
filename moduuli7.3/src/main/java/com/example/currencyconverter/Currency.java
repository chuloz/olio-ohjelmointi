package com.example.currencyconverter;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Currency {

    @Id
    private String code;
    private String name;
    private double exchangeRate;

    // Getterit ja setterit
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
