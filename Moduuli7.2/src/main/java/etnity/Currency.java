package etnity;

public class Currency {
    private String abbrievation;
    private String name;
    private double rate;

    public Currency(String abbrievation, String name, double rate) {
        this.abbrievation = abbrievation;
        this.name = name;
        this.rate = rate;
    }

    public String getAbbrievation() {
        return abbrievation;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }



}