package Task3;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Weight (g): ");
        double weightInGrams = Double.parseDouble(scanner.nextLine());

        int luotiPerNaula = 32;
        int naulaPerLeiviska = 20;
        double gramsPerLuoti = 13.28;

        double luoti = weightInGrams / gramsPerLuoti;
        double naula = luoti / luotiPerNaula;
        double leiviska = naula / naulaPerLeiviska;

        int leiviskaWhole = (int) leiviska;
        int naulaWhole = (int) ((naula - leiviskaWhole * naulaPerLeiviska));
        double luotiDecimal = (naula - leiviskaWhole * naulaPerLeiviska - naulaWhole) * luotiPerNaula;

        System.out.println(weightInGrams + " grams is " + leiviskaWhole + " leiviskä, " + naulaWhole +
                " naula, and " + String.format("%.2f", luotiDecimal) + " luoti.");
    }
}
