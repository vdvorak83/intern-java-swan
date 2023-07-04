package pattern.creation.adapter;

class WeatherAPIImpl implements WeatherAPI {
    public double getTemperature() {
        return 25.5;
    }

    public double getHumidity() {
        return 60.0;
    }
}