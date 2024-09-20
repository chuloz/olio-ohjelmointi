package Task2;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int threads = 3;
        int chunkSize = numbers.length / threads;

        ExecutorService executor = Executors.newFixedThreadPool(threads);
        CompletionService<Integer> completionService = new ExecutorCompletionService<>(executor);


        for (int i = 0; i < threads; i++) {
            int start = i * chunkSize;
            int end = (i == threads - 1) ? numbers.length - 1 : (i + 1) * chunkSize - 1;
            completionService.submit(new SumCalculator(numbers, start, end));
        }


        int totalSum = 0;
        for (int i = 0; i < threads; i++) {
            try {
                Future<Integer> future = completionService.take();
                totalSum += future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();

        System.out.println("Total sum: " + totalSum);
    }
}