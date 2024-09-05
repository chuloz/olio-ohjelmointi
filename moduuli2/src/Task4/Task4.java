package Task4;

public class Task4 {
    public static void main(String[] args) {
        Car1 myCar = new Car1("Toyota Corolla", 100, 200);

        myCar.turnOnCruiseControl(40);
        myCar.adjustSpeed();
        System.out.println(myCar.getTypeName() + " speed is " + myCar.getSpeed() + " km/h");
    }
}


class Car1 {
    private float speed;
    private float gasolineLevel;
    private String typeName;

    private float gasolinetankcapacity;
    private float topspeed;

    private boolean cruiseControlOn;
    private float targetSpeed;
    private float minSpeed;
    private float maxSpeed;

    public Car1(String typeName, float gasolinetankcapacity, float topspeed) {
        speed = 0;
        gasolineLevel = gasolinetankcapacity;
        this.typeName = typeName;
        this.topspeed = topspeed;
        this.gasolinetankcapacity = gasolinetankcapacity;

        cruiseControlOn = false;
        targetSpeed = 0;
        minSpeed = 30;
        maxSpeed = topspeed;
    }

    public void accelerate() {
        if (gasolineLevel > 0 && speed < topspeed) {
            speed += 5;
            consumeFuel();
        }
    }

    public void decelerate() {
        if (speed > 0) {
            speed = Math.max(0, speed - 5);
        }
    }

    private void consumeFuel() {

        gasolineLevel = Math.max(0, gasolineLevel - 1);
        if (gasolineLevel == 0) {
            speed = 0;
            if (cruiseControlOn) {
                cruiseControlOn = false;
            }
        }
    }

    public float getSpeed() {
        return speed;
    }

    public String getTypeName() {
        return typeName;
    }

    public void fillTank() {
        gasolineLevel = gasolinetankcapacity;
    }

    public boolean turnOnCruiseControl(float targetSpeed) {
        if (targetSpeed >= minSpeed && targetSpeed <= maxSpeed && gasolineLevel > 0) {
            cruiseControlOn = true;
            this.targetSpeed = targetSpeed;
            return true;
        } else {
            System.out.println("Cannot activate cruise control. ");
            cruiseControlOn = false;
            return false;
        }
    }

    public void turnOffCruiseControl() {
        cruiseControlOn = false;
        targetSpeed = 0;
    }

    public void adjustSpeed() {
        if (cruiseControlOn) {
            if (speed < targetSpeed) {
                accelerate();
            } else if (speed > targetSpeed) {
                decelerate();
            }
            if (gasolineLevel == 0) {
                cruiseControlOn = false;
                System.out.println("Cruise control turned off ");
            }
        }
    }
}