package Task1;

class Calculator {

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


    private int sum = 0;

    public void reset() {
        sum = 0;
    }

    public void add(int number) {
        sum = sum + number;
        if (number < 0 ){
            throw new IllegalArgumentException("Only positive numbers are allowed");
        }
    }

    public int getSum() {
        return sum;
    }

}
