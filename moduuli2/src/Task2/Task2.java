package Task2;

public class Task2 {
    public static void main(String[] args) {
        Auto omaAuto;

        omaAuto = new Auto("Toyota Corolla", 60.0, 100.0);
        omaAuto.taytaTankki();

        for (int i = 0; i < 6; i++) {
            omaAuto.kiihdyta();
        }

        while (omaAuto.nopeusOn() > 0) {
            omaAuto.hidasta(15);
            System.out.println(omaAuto.annaMerkki() + ": nopeus on " + omaAuto.nopeusOn() + " km/h");
        }
    }
}

class Auto {
    private double nopeus;
    private double bensiininMaara;
    private String merkki;
    private double tankinKapasiteetti;
    private double huippunopeus;

    public Auto(String merkki, double tankinKapasiteetti, double huippunopeus) {
        this.merkki = merkki;
        this.tankinKapasiteetti = tankinKapasiteetti;
        this.huippunopeus = huippunopeus;
    }

    public void kiihdyta() {
        if (bensiininMaara > 0 && nopeus < huippunopeus) {
            nopeus += 10;
        } else {
            nopeus = 0; // Asetetaan nopeus nollaan jos bensiiniä ei ole tai jos huippunopeus on saavutettu
        }
    }

    public void hidasta(int maara) {
        nopeus = Math.max(0, nopeus - maara); // Vähennetään nopeutta
    }

    public double nopeusOn() {
        return nopeus;
    }

    public String annaMerkki() {
        return merkki;
    }

    public void taytaTankki() {
        bensiininMaara = tankinKapasiteetti; // Täytetään tankki sen kapasiteetin mukaan
    }

    public double bensiininMaaraOn() {
        return bensiininMaara;
    }
}