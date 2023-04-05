package org.intern;

class Circle extends Shape {
    private double radius;

    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
