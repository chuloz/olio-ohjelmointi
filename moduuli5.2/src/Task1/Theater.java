package Task1;

import java.util.ArrayList;

public class Theater {
    private static final int MaxSeats = 10;
    private ArrayList<Integer> seats = new ArrayList<>();

    public Theater() {
        for (int i = 1; i <= MaxSeats; i++) {
            seats.add(i);
        }
    }

    public synchronized boolean bookTickets(int numTickets, int customerId) {
        if (numTickets > seats.size()) {
            System.out.println("Asikas " + customerId + " ei voinut varata " + numTickets + " lippua");
            return false;
        }else  {
            System.out.println("Asiakas " + customerId + "varasi " + numTickets + "lippua");
            for (int i = 0; i < numTickets; i++) {
                seats.remove(0);
            }
            return true;
        }
    }
}