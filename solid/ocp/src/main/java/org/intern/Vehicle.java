package org.intern;

/*
    Приклад коду, де не дотримується принцип open-closed

    public class Vehicle {
    private String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public void startEngine() {
        if (this.type.equals("car")) {
            System.out.println("Starting car engine.");
        } else if (this.type.equals("motorcycle")) {
            System.out.println("Starting motorcycle engine.");
        } else {
            System.out.println("Vehicle type not recognized.");
        }
    }
}
*/
//створюю інтерфейс щоб код можна було не змінювати, а розширювати
public interface Vehicle {
    public void startEngine();
}