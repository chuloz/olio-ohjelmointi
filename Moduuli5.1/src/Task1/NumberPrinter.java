package Task1;

public class NumberPrinter implements Runnable {
    private int start;
    private int end;

    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if ((i % 2) == 0) {
                System.out.println("Parillinen Thread (säie): " + i);
            }else {
                System.out.println("Pariton Thread (säie): " + i);
            }
        }
    }

}