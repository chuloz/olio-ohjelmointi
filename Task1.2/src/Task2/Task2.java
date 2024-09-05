package Task2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Anna suorakulmaisen kolmion sivun pituus ");
        int sivu1 = Integer.parseInt(reader.nextLine());

        System.out.println("Anna toisen sivun pituus ");
        int sivu2 = Integer.parseInt(reader.nextLine());

        double hypotenuusa = Math.sqrt(Math.pow(sivu1,2 ) + Math.pow(sivu2, 2));
        System.out.println("Suorakulmaisen Kolmion hypotenuusan pituus on " + hypotenuusa);

    }
}
