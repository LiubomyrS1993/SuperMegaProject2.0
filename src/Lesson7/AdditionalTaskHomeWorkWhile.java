package Lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdditionalTaskHomeWorkWhile {


    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        {
            System.out.println("Number of cars: ");
            int cars = getCars();
            int addMethodsWash = 0;

            while (addMethodsWash < cars) {
                System.out.println(addMethodsWash + 1 + " " + soapUpCar());
                System.out.println(addMethodsWash + 1 + " " + washCar());
                System.out.println(addMethodsWash + 1 + " " + dryCar());
                addMethodsWash++;
            }
        }
    }

    private static int getCars() throws IOException {
        int cars = Integer.parseInt(READER.readLine());
        return cars;
    }

    public static String soapUpCar() {

        return "the car is soaped";
    }

    public static String washCar() {
        return "the car is washed";
    }

    public static String dryCar() {
        return "the car is dried";
    }


}
