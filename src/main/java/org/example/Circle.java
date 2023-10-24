package org.example;



public class Circle {
    public static final double DOUBLE = 3.14;
    public double r;

    public Circle(double radius) {
        this.r = radius;

    }

    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        double area;
        area = DOUBLE * circle.r * circle.r;
        System.out.println("Radius:"+ circle.r);
        System.out.println("Area:" + area);
    }
}


