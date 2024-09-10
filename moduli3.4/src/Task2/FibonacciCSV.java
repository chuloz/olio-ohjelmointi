package Task2;
import java.io.FileWriter;
import java.io.IOException;

public class FibonacciCSV {
    public static void main(String[] args) {
        // Määritellään Fibonaccin sarjan alkuarvot
        int num1 = 0, num2 = 1;

        try {
            // Luodaan FileWriter objekti CSV-tiedoston kirjoittamista varten
            FileWriter writer = new FileWriter("fibonacci.csv");

            // Kirjoitetaan Fibonaccin sarja CSV-tiedostoon
            for (int i = 0; i < 100; i++) {
                writer.append(Integer.toString(num1)); // Lisätään nykyinen Fibonaccin luku tiedostoon
                writer.append(','); // Lisätään pilkku erottamaan lukuja
                int sum = num1 + num2; // Lasketaan seuraava Fibonacci-luku
                num1 = num2;
                num2 = sum;
            }

            // Suljetaan tiedosto
            writer.close();

            System.out.println("Fibonacci-sarja on tallennettu fibonacci.csv -tiedostoon.");
        } catch (IOException e) {
            System.err.println("Virhe tiedoston kirjoittamisessa: " + e.getMessage());
        }
    }
}