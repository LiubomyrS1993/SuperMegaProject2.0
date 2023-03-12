package Lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static Lesson7.AdditionalTaskHomeWorkWhile.*;

public class AdditionalTaskFor {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Cars number: ");
        int cars = Integer.parseInt(READER.readLine());

        for (int carsNumber = 0; carsNumber < cars; carsNumber++){

            System.out.println(carsNumber + 1 + " " + soapUpCar());
            System.out.println(carsNumber + 1 + " " + washCar());
            System.out.println(carsNumber + 1 + " " + dryCar());
        }

    }
}
