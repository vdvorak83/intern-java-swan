package org.intern;

public class Carr {
    private Engine engine;
    private FuelTank fuelTank;

    public Carr(Engine engine, FuelTank fuelTank) {
        this.engine = engine;
        this.fuelTank = fuelTank;
    }

    public void start() {
        fuelTank.decreaseFuelLevel();
        engine.start();
    }

    public void stop() {
        engine.stop();
    }
}
