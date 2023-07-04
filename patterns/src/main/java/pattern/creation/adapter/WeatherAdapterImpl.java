package pattern.creation.adapter;

import java.text.DecimalFormat;

class WeatherAdapterImpl implements WeatherAdapter {
    private WeatherAPI weatherAPI;

    public WeatherAdapterImpl(WeatherAPI weatherAPI) {
        this.weatherAPI = weatherAPI;
    }

    public int getWeatherCode() {
        return 200;
    }

    public double getTemperatureCelsius() {
        double temperatureFahrenheit = weatherAPI.getTemperature();
        double temperatureCelsius = (temperatureFahrenheit - 32) * 5 / 9;

        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String formattedTemperature = decimalFormat.format(temperatureCelsius);

        formattedTemperature = formattedTemperature.replace(",", ".");

        return Double.parseDouble(formattedTemperature);
    }

    public double getHumidityPercentage() {
        return weatherAPI.getHumidity();
    }
}
