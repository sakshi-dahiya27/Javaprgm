package javaexperiments;

import javaexperiments.geometry.*;

public class Experiment3 {
    public static void main(String[] args) {
        Drawable shape;

        // Circle
        Circle circle = new Circle(5);
        shape = circle;
        shape.draw();
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println();

        // Rectangle
        Rectangle rectangle = new Rectangle(4, 6);
        shape = rectangle;
        shape.draw();
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println();

        // Triangle
        Triangle triangle = new Triangle(3, 4, 5);
        shape = triangle;
        shape.draw();
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}