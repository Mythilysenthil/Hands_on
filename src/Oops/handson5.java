package Oops;

abstract class Shapes {

    String shapeName;

    Shapes(String name) {
        this.shapeName = name;
    }

    public abstract double area();

    public String toString() {
        return shapeName;
    }
}

class Sphere extends Shapes {

    double radius;

    Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    public String toString() {
        return super.toString() + " with radius " + radius;
    }
}

class Rectangle extends Shapes {

    double length;
    double width;

    Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public String toString() {
        return super.toString() + " with length " + length + " and width " + width;
    }
}

class Cylinder extends Shapes {

    double radius;
    double height;

    Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    public double area() {
        return Math.PI * radius * radius * height;
    }

    public String toString() {
        return super.toString() + " with radius " + radius + " and height " + height;
    }
}

class Paint {

    double coverage;

    Paint(double coverage) {
        this.coverage = coverage;
    }

    public double amount(Shapes s) {

        System.out.println("Computing amount for " + s);

        return s.area() / coverage;
    }
}


public class handson5 {

    public static void main(String[] args) {

        Paint paint = new Paint(350);

        Shapes deck = new Rectangle(20, 35);
        Shapes bigBall = new Sphere(15);
        Shapes tank = new Cylinder(10, 30);

        double deckAmount;
        double ballAmount;
        double tankAmount;

        deckAmount = paint.amount(deck);
        ballAmount = paint.amount(bigBall);
        tankAmount = paint.amount(tank);

        System.out.println("Paint needed for deck: " + deckAmount);
        System.out.println("Paint needed for bigBall: " + ballAmount);
        System.out.println("Paint needed for tank: " + tankAmount);
    }
}