package org.intern;

public class Start {
    public static void main(String[] args)
    {
        Airplane ap1 = new Airplane();
        Car cr1 = new Car();
        Motorcycle mc1= new Motorcycle();

        ap1.startEngine();
        cr1.startEngine();
        mc1.startEngine();
    }
}