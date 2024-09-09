package Task3;

// Luodaan ElectricVehicle-rajapinta
interface ElectricVehicle {
    void charge();
}

// Laajennetaan AbstractVehicle-luokka ElectricVehicle-rajapinnalla
abstract class AbstractVehicle implements ElectricVehicle {
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
    public abstract void start();
    public abstract void stop();

    // charge-metodi toteutetaan, koska se on rajapinnassa
    public void charge() {
        System.out.println("Charging is not possible.");
    }
}

// Luodaan ElectricCar-luokka, joka laajentaa AbstractVehiclea
class ElectricCar extends AbstractVehicle {
    private String color;

    // Konstruktori
    public ElectricCar(String color) {
        super("Electric Car", "Electricity");
        this.color = color;
    }

    // start-metodi
    public void start() {
        System.out.println("Electric Car is starting...");
    }

    // stop-metodi
    public void stop() {
        System.out.println("Electric Car is stopping...");
    }

    // getInfo-metodi, joka lisää auton värin tietoihin
    public String getInfo() {
        return super.getInfo() + "\nColor: " + color;
    }
}

// Luodaan ElectricMotorcycle-luokka, joka laajentaa AbstractVehiclea
class ElectricMotorcycle extends AbstractVehicle {
    // Konstruktori
    public ElectricMotorcycle() {
        super("Electric Motorcycle", "Electricity");
    }

    // start-metodi
    public void start() {
        System.out.println("Electric Motorcycle is starting...");
    }

    // stop-metodi
    public void stop() {
        System.out.println("Electric Motorcycle is stopping...");
    }
}

// Luodaan VehicleDemo-luokka liittymän toteutusten demonstroimiseksi
public class Sahko_ajoneuvoDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration\n");

        // Luodaan ElectricCar- ja ElectricMotorcycle-instanssit
        ElectricCar electricCar = new ElectricCar("Blue");
        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle();

        // Käynnistetään ja pysäytetään jokainen ajoneuvo sekä näytetään niiden tiedot
        System.out.println("Electric Car:");
        electricCar.start();
        electricCar.stop();
        electricCar.charge(); // Lataus ei ole mahdollista
        System.out.println(electricCar.getInfo() + "\n");

        System.out.println("Electric Motorcycle:");
        electricMotorcycle.start();
        electricMotorcycle.stop();
        electricMotorcycle.charge(); // Lataus ei ole mahdollista
        System.out.println(electricMotorcycle.getInfo());
    }
}