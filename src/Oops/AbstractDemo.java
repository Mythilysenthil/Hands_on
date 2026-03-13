package Oops;

abstract class Shape {
	void draw() {
		System.out.println("drawing...");
	}
	abstract void area();
	abstract void perimeter();
}

class Rectangle extends Shape {
	private int length,breadth;
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	void area() {
        System.out.println("Area of Rectangle: " +(length * breadth));
    }

    void perimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + breadth)));
    }
}

class Square extends Shape {
    private int side;
    Square(int side){
    	this.side = side;
    }
    void area() {
        System.out.println("Area of Square: " +(side*side));
    }

    void perimeter() {
        System.out.println("Perimeter of Square: " + (4 * side));
    }
}

class Circle extends Shape {
    private int radius;
    final double pi = 3.14;
    Circle(int radius){
    	this.radius = radius;
    }
    void area() {
        System.out.println("Area of Circle: " +(pi*(radius*radius)));
    }

    void perimeter() {
        System.out.println("Perimeter of Cirle: " + (2 * (pi*radius)));
    }
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shape s;
		 s = new Rectangle(3,5);
		 s.area();
		 s.perimeter();
		 
		 s = new Square(4);
		 s.area();
		 s.perimeter();

	     s = new Circle(2);
	     s.area();
	     s.perimeter();
	}
}
