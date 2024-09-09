package Task1;

// Luodaan Vehicle-liittymä
interface Vehicle {
    void start();
    void stop();
    String getInfo();
}

// Luodaan Car-luokka, joka toteuttaa Vehicle-liittymän
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }

    public void stop() {
        System.out.println("Car is stopping...");
    }

    public String getInfo() {
        return "Type: Car\nFuel: Petrol\nColor: Red";
    }
}

// Luodaan Motorcycle-luokka, joka toteuttaa Vehicle-liittymän
class Motorcycle implements Vehicle {
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    public String getInfo() {
        return "Type: Motorcycle\nFuel: Gasoline\nColor: Black";
    }
}

// Luodaan Bus-luokka, joka toteuttaa Vehicle-liittymän
class Bus implements Vehicle {
    public void start() {
        System.out.println("Bus is starting...");
    }

    public void stop() {
        System.out.println("Bus is stopping...");
    }

    public String getInfo() {
        return "Type: Bus\nFuel: Diesel\nCapacity: 40 passengers";
    }
}

// Luodaan VehicleDemo-luokka mikä toteutaa demostrointi
public class AjoneuvoDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration\n");

        // Luodaan Car-, Motorcycle- ja Bus-instanssit
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle bus = new Bus();

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