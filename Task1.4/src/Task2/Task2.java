package Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("syötä taulukon koko: ");
        int koko = scanner.nextInt();

        int[] numerot = new int[koko];
        System.out.println("Syötä kokonaisluvut taulukkoon: ");

        for (int i = 0; i < koko; i++) {
            System.out.println("Syötä kokonaisluku " + (i + 1) + ": ");
            numerot[i] = scanner.nextInt();
        }

        int suurinSumma = numerot[0];
        int alkuIndeksi = 0;
        int loppuIndeksi = 0;

        for (int i = 0; i < koko; i++) {
            int nykyinenSumma = 0;
            for (int j = i; j < koko; j++) {
                nykyinenSumma += numerot[j];
                if (nykyinenSumma > suurinSumma) {
                    suurinSumma = nykyinenSumma;
                    alkuIndeksi = i;
                    loppuIndeksi =j;
                }
            }
        }

        System.out.println("Suurin summa: " + suurinSumma);
        System.out.println("Kokonaisluvut: " + (alkuIndeksi + 1) + "-" + (loppuIndeksi + 1));
    }
}
