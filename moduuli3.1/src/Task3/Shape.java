package Task3;

public class Shape {
    // Metodi laskee alan
    public double calculateArea() {
        return 0;
    }

    // Aliluokka Circle (ympyrä)
    static class Circle extends Shape {
        private double radius; // (säde)

        //konstruktori
        public Circle(double radius) {
            this.radius = radius;
        }

        //ylikirjoitetaan calculateArea-metodi ympyrälle
        @Override
        public double calculateArea() {
            return Math.PI * radius * radius; // (ympyrän ala)
        }
    }
    // tehdään Aliluokka Rectangle (suorakulmio)
    static class Rectangle extends Shape {
        private double width; //leveys
        private double height; //

        //kostruktori
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        //ylikirjoitetaan calculateArea-metodi suorakulmiolle
        @Override
        public double calculateArea() {
            return width * height; // suorakulmion ala
        }
    }

    static class Triangle extends Shape {
        private double base; // kanta
        private  double height; // korkeus

        //konstruktori
        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        //ylikirjoitetaan calculateArea-metodi kolmiolle.
        @Override
        public double calculateArea() {
            return 0.5* base * height;
        }
    }
}

//pääluokka
class ShapeCalculator {
    public static void main(String[] args) {
        //luodaan shape-oliolista taulukko
        Shape[] shapes = new Shape[]{
                new Shape.Circle(5.0), //ympyrä
                new Shape.Rectangle(4.0, 6.0), //suorakulmio
                new Shape.Triangle(3.0, 8.0) // kilmio
        };

        System.out.println("ShapeCalculator\n ");
        for (Shape shape: shapes) {
            System.out.println("Area " + shape.calculateArea());
        }
    }
}