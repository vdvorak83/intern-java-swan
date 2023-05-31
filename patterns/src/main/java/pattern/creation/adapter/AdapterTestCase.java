package pattern.creation.adapter;

public class AdapterTestCase {
    public static void main(String[] args) {
        WeatherAPI weatherAPI = new WeatherAPIImpl();

        WeatherAdapter weatherAdapter = new WeatherAdapterImpl(weatherAPI);

        int weatherCode = weatherAdapter.getWeatherCode();
        double temperature = weatherAdapter.getTemperatureCelsius();
        double humidity = weatherAdapter.getHumidityPercentage();

        System.out.println("Code of weather: " + weatherCode);
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity: " + humidity + "%");
    }
}
