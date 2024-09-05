package Task3;

public class Task3 {
    public boolean isOn;
    public String coffeeType;
    public int coffeeAmount;

    public void setCoffeeType(String type) {
        if (isOn) {
            if (type.equals("normal") || type.equals("espresso")) {
                coffeeType = type;
            } else {
                System.out.println("Kahvia ei ole menussa.");
            }
        } else {
            System.out.println("Laitteen pitää olla päällä ");
        }
    }

    public void setCoffeeAmount(int coffeeAmount) {
        if (isOn) {
            if (coffeeAmount >= 10 && coffeeAmount <= 80) {
                this.coffeeAmount = coffeeAmount;
            } else {
                System.out.println("Kahvimäärän tulee olla 10-80 ml välillä.");
            }
        }
    }

    public void printSetting() {
        System.out.println("Kahvinkeittimen asetukset");
        System.out.println("Päällä: " + (isOn ? "Kyllä" : "Ei"));
        System.out.println("Kahvityyppi: " + coffeeType);
        System.out.println("Kahvimäärä: " + coffeeAmount + " ml");
    }

    public void togglePower() {
        isOn = !isOn;
    }

    public static void main(String[] args) {
        Task3 coffeeMaker = new Task3();
        coffeeMaker.togglePower();
        coffeeMaker.setCoffeeType("normal");
        coffeeMaker.setCoffeeAmount(68);
        coffeeMaker.printSetting();
    }
}