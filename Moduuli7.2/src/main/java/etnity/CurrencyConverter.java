package etnity;



import java.util.HashMap;

public class CurrencyConverter {
    private HashMap<String, Currency> currencies = new HashMap<>();

    public CurrencyConverter() {

    }

    public double convert(Currency from, Currency to, double amount){
        return amount * (from.getRate() / to.getRate());
    }

    public HashMap<String, Currency> getCurrencies() {
        return currencies;
    }

}