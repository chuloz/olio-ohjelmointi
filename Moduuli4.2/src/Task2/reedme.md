package Task2;

Introduction
This project is a simple calculator that can add numbers. The project is used to demonstrate unit testing with JUnit.




class Calculator {

//Main class that contains the calculator logic. The class has three methods: reset, add, and getSum.
//The reset method sets the sum to zero. The add method adds a number to the sum. The getSum method returns the current sum.

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {

            calc.add(20);
            calc.add(30);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Current value: " + calc.getSum());
    }

The sum of the numbers added to the calculator.

    private int sum = 0;


Set the sum to zero.

    public void reset() {
        sum = 0;
    }


Add a number to the sum. Only positive numbers are allowed.

    public void add(int number) {
        sum = sum + number;
        if (number < 0 ){
            throw new IllegalArgumentException("Only positive numbers are allowed");
        }
    }
Return the current sum.

    public int getSum() {
        return sum;
    }


}