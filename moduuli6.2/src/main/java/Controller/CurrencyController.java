package Controller;

import Model.CurrencyConverter;
import View.CurrencyView;

import java.util.ArrayList;

public class CurrencyController {
    private final ArrayList<CurrencyConverter> currencies = new ArrayList<>();
    private static CurrencyController instance = null;

    private CurrencyController(){
        this.currencies.add(new CurrencyConverter("USD", 1.0));
        this.currencies.add(new CurrencyConverter("EUR", 0.85));
        this.currencies.add(new CurrencyConverter("GBP", 0.75));
        this.currencies.add(new CurrencyConverter("JPY", 110.0));
    }

    public static CurrencyController getInstance(){
        if(instance == null){
            instance = new CurrencyController();
        }
        return instance;
    }

    public double convert(CurrencyConverter from, CurrencyConverter to, double amount){
        return amount * (from.getRate() / to.getRate());
    }


    public ArrayList<CurrencyConverter> getCurrencies() {
        return currencies;
    }



}