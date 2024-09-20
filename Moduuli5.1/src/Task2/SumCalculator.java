package Task2;
import java.util.concurrent.*;

public class SumCalculator implements Callable<Integer> {
    private int[] numbers;
    private int start;
    private int end;

    public SumCalculator(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    public Integer call() {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}