package Task1;
import java.util.Scanner;
public class Task1 {

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Syötä lämpötilat Fahrenheit asteina: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.printf("Lämpötila Celsius-asteina: %.1f%n", celsius);
        scanner.close();

    }
}
