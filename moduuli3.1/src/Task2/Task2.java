package Task2;

public class Task2 {
    public static void main(String[] args) {
        Bus myBus = new Bus("Volvo", 100.0, 120.0); // Luodaan Bussi-olio
        myBus.tankFill(); // Täytetään tankki

        // Lisätään matkustajia
        myBus.passengerEnter(10);
        myBus.passengerEnter(5);

        // Poistetaan matkustajia
        myBus.passengerExit(2);

        // Tulostetaan bussissa olevien matkustajien lukumäärä
        System.out.println("Passenger count: " + myBus.getPassengerCount());
    }
}

class Car {
    protected double speed;
    protected double fuelAmount;
    protected String brand;
    protected double tankCapacity;
    protected double topSpeed;

    public Car(String brand, double tankCapacity, double topSpeed) {
        this.brand = brand;
        this.tankCapacity = tankCapacity;
        this.topSpeed = topSpeed;
    }

    public void accelerate() {
        if (fuelAmount > 0 && speed < topSpeed) {
            speed += 10;
        } else {
            speed = 0;
        }
    }

    public void brake(int amount) {
        speed = Math.max(0, speed - amount);
    }

    public double getSpeed() {
        return speed;
    }

    public String getBrand() {
        return brand;
    }

    public void tankFill() {
        fuelAmount = tankCapacity;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }
}

class Bus extends Car {
    private int passengers; // Matkustajien lukumäärä.

    public Bus(String brand, double tankCapacity, double topSpeed) {
        super(brand, tankCapacity, topSpeed);
        this.passengers = 0; // Alustetaan matkustajien lukumäärä nollaksi
    }

    // Metodi matkustajien lisäämiseksi bussiin
    public void passengerEnter(int count) {
        this.passengers += count;
        System.out.println(count + " passengers entered the bus.");
    }

    // Metodi matkustajien poistamiseksi bussista
    public void passengerExit(int count) {
        if (this.passengers >= count) {
            this.passengers -= count;
            System.out.println(count + " passengers exited the bus.");
        } else {
            System.out.println("There are not enough passengers in the bus.");
        }
    }

    // Metodi, joka palauttaa bussissa olevien matkustajien lukumäärän.
    public int getPassengerCount() {
        return this.passengers;
    }
}