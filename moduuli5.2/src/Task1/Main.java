package Task1;

public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater();

        for (int i = 1; i <= 15; i++) {
            Customer customer = new Customer(i, theater);
            customer.start();
        }
    }
}