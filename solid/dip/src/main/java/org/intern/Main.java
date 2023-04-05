package org.intern;
/*
реалізація програми не використовуючи п'ятий принцип солід
клас weather залежить від конкретного класу AccuWeatherAPI, самостійно створює екземпляр класу AccuWeatherAPI, що не є правильно.
class Weather {
    private AccuWeatherAPI api;

    public Weather() {
        this.api = new AccuWeatherAPI();
    }

    public String getTemperature(String location) {
        return api.getTemperature(location);
    }
}

class AccuWeatherAPI {
    public String getTemperature(String location) {
        // реалізація методу
    }
}
*/
public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        };
        FuelTank fuelTank = new FuelTank() {
            @Override
            public void decreaseFuelLevel() {

            }
        };
        Carr car = new Carr(engine, fuelTank);

        car.start();
        car.stop();
    }
}