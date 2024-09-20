package Task1;
public class Main {
    public static void main(String[] args) {
        int start = 1;
        int end = 20;

        Runnable oddPrinter = new NumberPrinter(start, end);
        Runnable evenPrinter = new NumberPrinter(start + 1, end);

        Thread oddThread = new Thread(oddPrinter);
        Thread evenThread = new Thread(evenPrinter);

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Tulostus valmis.");
    }
}