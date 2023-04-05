package org.intern;
/*
    Приклад не використовуючи трейтій принцип солід
    У обох класів відсутній спільний батьківський клас, який би містив метод "calculateArea" і дозволяв би заміняти об'єкти підтипами.

    class Rectangle {
    protected double width;
    protected double height;
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double calculateArea() {
        return width * height;
    }
}

class Circle {
    protected double radius;
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
*/
public class Main {
    public static void main(String[] args) {
        Rectangle shape1 = new Rectangle();
        shape1.setWidth(10);
        shape1.setHeight(20);
        System.out.println(shape1.calculateArea());



        Circle shape2 = new Circle();
        shape2.setRadius(5);
        System.out.println(shape2.calculateArea());
    }
}