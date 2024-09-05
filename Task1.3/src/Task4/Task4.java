package Task4;

import java.util.Scanner;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int tulos = 0;

        while (tulos < 10) {
            int numero1 = random.nextInt(10) + 1;
            int numero2 = random.nextInt(10) + 1;
            System.out.println(" Paljon on "  + numero1 + " kertaa "  + numero2 + " ? ");
            int vastaus = scanner.nextInt();

            if (vastaus == numero1 * numero2) {
                System.out.println("Oikea vastaus!");
                tulos++;
            } else {
                System.out.println("Väärä vastaus");
            }
        }

        System.out.println("Hyvä nyt osaat kertolaskut");
        scanner.close();
    }
}
