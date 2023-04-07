package Lesson15.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureConverter implements Converter {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        convert(reader);
    }

    private static void convert(BufferedReader reader) {
        try {
            System.out.print("Enter the temperature in degrees Celsius: ");
            double celsius = Double.parseDouble(reader.readLine());
            System.out.print("Enter the unit to convert to (K for Kelvin, F for Fahrenheit): ");
            String unit = reader.readLine();
            Converter converter;
            if (unit.equalsIgnoreCase("K")) {
                converter = new CelsiusToKelvinConverter();
            } else if (unit.equalsIgnoreCase("F")) {
                converter = new CelsiusToFahrenheitConverter();
            } else {
                System.out.println("Invalid unit. Please enter K or F.");
                return;
            }
            double result = converter.convert(celsius);
            System.out.println(celsius + " degrees Celsius is " + result + " " + unit);
        } catch (IOException e) {
            System.out.println("Error reading input.");
            e.printStackTrace();
        }
    }

    @Override
    public double convert(double input) {
        return 0;
    }
}


