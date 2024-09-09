package Task4;

public class Shape {
    private String color; // Lisää väriominaisuus

    // Konstruktori
    public Shape(String color) {
        this.color = color;
    }

    // Metodi laskee alan
    public double calculateArea() {
        return 0;
    }

    // Metodi palauttaa värin
    public String getColor() {
        return color;
    }

    // Aliluokka Circle (ympyrä)
    static class Circle extends Shape {
        private double radius; // (säde)

        // Konstruktori
        public Circle(double radius, String color) {
            super(color); // Kutsu yläluokan konstruktoria.
            this.radius = radius;
        }

        // Ylikirjoitetaan calculateArea-metodi ympyrälle.
        @Override
        public double calculateArea() {
            return Math.PI * radius * radius; // (ympyrän ala)
        }
    }

    // Aliluokka Rectangle (suorakulmio)
    static class Rectangle extends Shape {
        private double width; //leveys
        private double height; //

        // Konstruktori
        public Rectangle(double width, double height, String color) {
            super(color); // Kutsu yläluokan konstruktoria
            this.width = width;
            this.height = height;
        }

        // Ylikirjoitetaan calculateArea-metodi suorakulmiolle
        @Override
        public double calculateArea() {
            return width * height; // suorakulmion ala
        }
    }

    // Aliluokka Triangle (kolmio)
    static class Triangle extends Shape {
        private double base; // kanta
        private  double height; // korkeus

        // Konstruktori
        public Triangle(double base, double height, String color) {
            super(color); // Kutsu yläluokan konstruktoria
            this.base = base;
            this.height = height;
        }

        // Ylikirjoitetaan calculateArea-metodi kolmiolle
        @Override
        public double calculateArea() {
            return 0.5 * base * height;
        }
    }

    // Pääluokka
    public static class ShapeCalculator {
        public static void main(String[] args) {
            // Luodaan Shape-olioista muodostettu taulukko
            Shape[] shapes = {
                    new Circle(5.0, "Red"),        // Ympyrä
                    new Rectangle(4.0, 6.0, "Blue"), // Suorakulmio
                    new Triangle(3.0, 8.0, "Green")  // Kolmio
            };

            // Käydään läpi taulukko ja näytetään kunkin muodon alue ja väri
            System.out.println("ShapeCalculator\n");
            for (Shape shape : shapes) {
                System.out.println("Alue: " + shape.calculateArea() + ", Väri: " + shape.getColor());
            }
        }
    }
}