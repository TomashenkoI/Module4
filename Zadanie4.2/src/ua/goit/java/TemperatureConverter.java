package ua.goit.java;

import static ua.goit.java.Celsius.*;

/**
 * Created by 7 on 10.03.2016.
 */
public class TemperatureConverter {
    public static void main(String[] args) {
        Celsius celsiusTemperature = new Celsius();
        Farenheit farenheitTemperature = new Farenheit();

        double FarenheitTemperature = Celsius.Temperature*1.8+32.0;
        System.out.println("Farenheit Temperature = "+FarenheitTemperature);

        double CelsiusTemperature = (FarenheitTemperature-32.0)/1.8;
        System.out.println("Celsius Temperature = "+CelsiusTemperature);
    }
}
