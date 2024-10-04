package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class task2 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(20);
        numbers.add(15);
        numbers.add(3);
        numbers.add(12);

        System.out.println("Original list: " + numbers);


        Predicate<Integer> isEven = number -> number % 2 == 0;
        numbers.removeIf(isEven);
        System.out.println("After filtering out even numbers: " + numbers);

        numbers.replaceAll(number -> number % 2 != 0 ? number * 2 : number);

        System.out.println("After doubling odd numbers: " + numbers);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of all numbers: " + sum);
    }
}