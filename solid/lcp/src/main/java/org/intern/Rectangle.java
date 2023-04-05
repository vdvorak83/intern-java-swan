package org.intern;

class Rectangle extends Shape {
    private double width;
    private double height;

    public void setWidth(int width)
    {
        this.width = width;
    }
    public void setHeight(int height)
    {
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
}
