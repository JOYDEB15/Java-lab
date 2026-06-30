package project1;

abstract class Shape {

    abstract void area();
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {
    int length = 10;
    int width = 5;

    void area() {
        int result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.area();
        r.area();
    }
}
