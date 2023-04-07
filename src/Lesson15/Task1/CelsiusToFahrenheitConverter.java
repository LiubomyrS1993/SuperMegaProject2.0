package Lesson15.Task1;

class CelsiusToFahrenheitConverter implements Converter {
    @Override
    public double convert(double input) {
        return input * 1.8 + 32;
    }
}
