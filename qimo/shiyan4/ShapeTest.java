package qimo.shiyan4;

import java.util.Scanner;

interface Shape {
    double length();
}

class Triangle implements Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double length() {
        if (a <= 0 || b <= 0 || c <= 0) return 0;
        if (a + b > c && a + c > b && b + c > a) {
            return a + b + c;
        }
        return 0;
    }
}

class Rectangle implements Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double length() {
        if (length <= 0 || width <= 0) return 0;
        return 2 * (length + width);
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double length() {
        if (radius <= 0) return 0;
        return 2 * 3.14 * radius;
    }
}

class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double radius = scanner.nextDouble();

        Shape triangle = new Triangle(a, b, c);
        Shape rectangle = new Rectangle(length, width);
        Shape circle = new Circle(radius);

        System.out.printf("%.2f\n", triangle.length());
        System.out.printf("%.2f\n", rectangle.length());
        System.out.printf("%.2f\n", circle.length());

        scanner.close();
    }
}