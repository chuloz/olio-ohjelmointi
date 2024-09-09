package Task1;

public class Task1 {
    public static void main(String[] args) {
        UrheiluAuto omaUrheiluAuto;

        omaUrheiluAuto = new UrheiluAuto("Ferrari", 70.0, 200.0); // Luodaan UrheiluAuto-olio
        omaUrheiluAuto.taytaTankki();

        for (int i = 0; i < 6; i++) {
            omaUrheiluAuto.kiihdyta(); // Kiihdytetään useita kertoja.
        }

        while (omaUrheiluAuto.nopeusOn() > 0) {
            omaUrheiluAuto.hidasta(20); // Hidastetaan UrheiluAutoa
            System.out.println(omaUrheiluAuto.annaMerkki() + ": nopeus on " + omaUrheiluAuto.nopeusOn() + " km/h");
        }
    }
}

class Auto {
    protected double nopeus;
    protected double bensiininMaara;
    protected String merkki;
    protected double tankinKapasiteetti;
    protected double huippunopeus;

    public Auto(String merkki, double tankinKapasiteetti, double huippunopeus) {
        this.merkki = merkki;
        this.tankinKapasiteetti = tankinKapasiteetti;
        this.huippunopeus = huippunopeus;
    }

    public void kiihdyta() {
        if (bensiininMaara > 0 && nopeus < huippunopeus) {
            nopeus += 10;
        } else {
            nopeus = 0; // Asetetaan nopeus nollaan jos bensiiniä ei ole tai jos huippunopeus on saavutettu.
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

class UrheiluAuto extends Auto {
    public UrheiluAuto(String merkki, double tankinKapasiteetti, double huippunopeus) {
        super(merkki, tankinKapasiteetti, huippunopeus); // Kutsutaan Auto-luokan konstruktoria
    }

    // Ylikirjoitetaan kiihdyta-metodi paremmalla kiihtyvyydellä
    @Override
    public void kiihdyta() {
        if (bensiininMaara > 0 && nopeus < huippunopeus) {
            nopeus += 20; // Parempi kiihtyvyys UrheiluAutolle
        } else {
            nopeus = 0; // Asetetaan nopeus nollaan jos bensiiniä ei ole tai jos huippunopeus on saavutettu
        }
    }

    // Ylikirjoitetaan hidasta-metodi paremmalla hidastuvuudella
    @Override
    public void hidasta(int maara) {
        nopeus = Math.max(0, nopeus - maara); // Vähennetään nopeutta
    }
}