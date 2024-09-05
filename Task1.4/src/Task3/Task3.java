package Task3;

import java.util.Scanner;
import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Syötä taulukon koko: ");
        int koko = scanner.nextInt();

        int[] numerot = new int[koko];
        System.out.println("Syötä kokonailuvut taulukkoon: ");

        for (int i = 0; i < koko; i++) {
            System.out.println("Syötä kokonaisluku " + (i + 1) + ": ");
            numerot[i] = scanner.nextInt();
        }

        //tehdään uusi lista mihin tallenetaan ainutlaatuiset numerot
        ArrayList<Integer> ainutlaatuisetNumerot = new ArrayList<>();

        //käydään läpi alkuperäinen taulukko
        for (int numero : numerot) {
            //jos numero ei ole lisätty vielä ainutlaatuisten listaan niin lisätään ne
            if (!ainutlaatuisetNumerot.contains(numero)) {
                ainutlaatuisetNumerot.add(numero);
            }
        }

        //tulostetaan lopulliset ainutlaatuiset numerot
        System.out.println("\nTaulukko ilman duplinkaatteja: ");
        for (int numero : ainutlaatuisetNumerot) {
            System.out.println(numero + " ");
        }
    }

}
