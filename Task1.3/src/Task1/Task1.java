package Task1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Syötä toiseen asteen yhtälö kertoimet (a b ja C)");

        System.out.println("a: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.println("b: ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.println("c ");
        double c = Double.parseDouble(scanner.nextLine());

        //Diskrimantti on luku joka laskee toisen asteen yhtälö
        double diskriminantti = b * b - 4 * a * c;

        if (diskriminantti > 0) {
            double x1 = (-b + Math.sqrt(diskriminantti)) / (2 * a);
            double x2 = (-b - Math.sqrt(diskriminantti)) / (2 * a);
            System.out.println("Yhtälö juuret ovat : x1 = " + x1 + ", x2 = " + x2);
        } else if (diskriminantti == 0) {
            double x = -b / (2 * a);
            System.out.println("Yhtälöllä on yksi juuri: x = " + x);
        }else {
            System.out.println("Ei reaallinen juuri.");
        }
    }
}