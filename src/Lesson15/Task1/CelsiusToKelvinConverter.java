package Lesson15.Task1;

class CelsiusToKelvinConverter implements Converter {
    @Override
    public double convert(double input) {
        return input + 273.15;
    }
}
