package Task2;

import java.util.Scanner;

public class BinaariDesimaaleiksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pyydetään käyttäjältä binaariluku
        System.out.println("Syötä binaariluku: ");
        String binaari = scanner.nextLine();

        // Muunnetaan binaariluku desimaaliksi
        int desimaali = binaariDesimaaleiksi(binaari);

        // Näytetään desimaalivastine konsolissa
        System.out.println("Desimaalivastine: " + desimaali);
    }

    // Binaariluku muutetaan desimaaliksi
    public static int binaariDesimaaleiksi(String binaari) {
        int desimaali = 0;
        int length = binaari.length();

        for (int i = length - 1; i >= 0; i--) {
            if (binaari.charAt(i) == '1') {
                desimaali += Math.pow(2, length - i - 1);
            }
        }
        return desimaali;
    }
}
