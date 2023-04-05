package org.intern;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int area() {
        return (int) (Math.PI * Math.pow(this.radius, 2));
    }
}