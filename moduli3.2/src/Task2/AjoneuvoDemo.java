package Task2;

// Luodaan Vehicle-liittymä
interface Vehicle {
    void start();
    void stop();
    String getInfo();
}

// Luodaan abstrakti luokka AbstractVehicle
abstract class AbstractVehicle implements Vehicle {
    private String type;
    private String fuel;

    // Konstruktori
    public AbstractVehicle(String type, String fuel) {
        this.type = type;
        this.fuel = fuel;
    }

    // Getterit ja setterit
    public String getType() {
        return type;
    }

    public String getFuel() {
        return fuel;
    }

    // getInfo-metodi toteutetaan, koska se on abstraktissa luokassa
    public String getInfo() {
        return "Type: " + type + "\nFuel: " + fuel;
    }

    // Abstraktit start- ja stop-metodit
    public abstract void  start();
    public abstract void stop();
}

// Luodaan Car-luokka
class Car extends AbstractVehicle {
    private String color;

    // Konstruktori
    public Car(String fuel, String color) {
        super("Car", fuel);
        this.color = color;
    }

    // start-metodi
    public void start() {
        System.out.println("Car is starting...");
    }

    // stop-metodi
    public void stop() {
        System.out.println("Car is stopping...");
    }

    // getInfo-metodi, joka lisää auton värin tietoihin
    public String getInfo() {
        return super.getInfo() + "\nColor: " + color;
    }
}

// Luodaan Motorcycle-luokka
class Motorcycle extends AbstractVehicle {
    // Konstruktori
    public Motorcycle(String fuel) {
        super("Motorcycle", fuel);
    }

    // start-metodi
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    // stop-metodi
    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }
}

// Luodaan Bus-luokka
class Bus extends AbstractVehicle {
    private int capacity;

    // Konstruktori
    public Bus(String fuel, int capacity) {
        super("Bus", fuel);
        this.capacity = capacity;
    }

    // start-metodi
    public void start() {
        System.out.println("Bus is starting...");
    }

    // stop-metodi
    public void stop() {
        System.out.println("Bus is stopping...");
    }

    // getInfo-metodi, joka lisää bussin kapasiteetin tietoihin
    public String getInfo() {
        return super.getInfo() + "\nCapacity: " + capacity + " passengers";
    }
}

// Luodaan VehicleDemo-luokka
public class AjoneuvoDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration\n");

        // Luodaan Car-, Motorcycle- ja Bus-instanssit
        Car car = new Car("Petrol", "Red");
        Motorcycle motorcycle = new Motorcycle("Gasoline");
        Bus bus = new Bus("Diesel", 40);

        // Käynnistetään ja pysäytetään jokainen ajoneuvo sekä näytetään niiden tiedot
        System.out.println("Car:");
        car.start();
        car.stop();
        System.out.println(car.getInfo() + "\n");

        System.out.println("Motorcycle:");
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo() + "\n");

        System.out.println("Bus:");
        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());
    }
}