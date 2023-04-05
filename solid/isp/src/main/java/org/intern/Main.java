package org.intern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Rectangle(5, 10));
        shapes.add(new Circle(7));

        AreaCalculator calculator = new AreaCalculator(shapes);
        System.out.println("Total area: " + calculator.sum());
    }
}