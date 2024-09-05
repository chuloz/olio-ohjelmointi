package Task3;
import java.util.Scanner;

public class Alkuluku {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("syötä aloitusarvo: ");
        int startValue = scan.nextInt();

        System.out.print("syötä loppuarvo: ");
        int endValue = scan.nextInt();

        if (startValue < 2) {
            System.out.println("Alun arvon on oltava vähintään 2.");
            return;
        }
        if (endValue <= startValue) {
            System.out.println("Lopetusarvon on oltava suurempi kuin aloitusarvo.");
            return;
        }

        System.out.println("Alkuluvut välillä " + startValue + " ja " + endValue + ":");
        for (int i = startValue; i <= endValue; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}