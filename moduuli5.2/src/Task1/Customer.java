package Task1;

public class Customer extends Thread {
    private int customerId;
    private Theater theater;

    public Customer(int customerId, Theater theater) {
        this.customerId = customerId;
        this.theater = theater;
    }


    public void run() {
        int numTickets = (int) (Math.random() * 5) + 1;
        theater.bookTickets(numTickets, customerId);
    }
}