package application;

import etnity.Currency;

import dao.CurrencyDao;
import etnity.CurrencyConverter;

import java.util.*;

public class CurrencyApp {

    public static void main(String[] args) {

        CurrencyDao currencyDao = new CurrencyDao();
        CurrencyConverter currencyConverter = new CurrencyConverter();

        List<Currency> currencies = currencyDao.getAllCurrencies();
        for (Currency currency : currencies) {
            System.out.println(currency.getAbbrievation() + " " + currency.getName() + " " + currency.getRate());
        }

        System.out.println(currencyDao.getExchangeRate("EUR"));

        System.out.println(currencyDao.getExchangeRate("ASFDS"));

        System.out.println(currencyDao.getExchangeRate("USD"));
    }
}