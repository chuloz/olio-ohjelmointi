package Task1;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // tässä ennalta määriteltyt etu ja sukunimet
        String[] etuNimi = {"Muha ", "Emma ", "Matti ", "Taylor ", "Peppi "};
        String[] sukuNimi ={"Smith ", "Jokinen ", "Lindström ", "Wilson ", "Andreson "};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //tässä kysytään monta nimee halutaan generoida
        System.out.println("Kuinka monta satunnaista nimeä haluat generoida? ");
        int numOfNames = scanner.nextInt();

        //generoidaan ja tulostetaan satunnaiset nimet
        for (int i = 0; i < numOfNames; i++) {
            //tässä valitaan satunnaisesti indeksin etunimelle ja sukunimelle
            int etuNimiIndex = random.nextInt(etuNimi.length);
            int sukuNimiIndex = random.nextInt(sukuNimi.length);

            //sitten luodaan satunnainen kokonaisnimi
            String kokonimi = etuNimi[etuNimiIndex] + "" + sukuNimi[sukuNimiIndex];

            //lopuksi tulostetaan generoitu kokonaisnimi
            System.out.println("Satunnainen nimi " + (i + 1) + ": " + kokonimi);
        }
    }
}
