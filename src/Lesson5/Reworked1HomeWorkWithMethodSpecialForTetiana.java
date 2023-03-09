package Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reworked1HomeWorkWithMethodSpecialForTetiana {

    public static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        float chemistry = inputYourRates("Input your chemistry rate: ");
        float math = inputYourRates("Input your math rate: ");
        float history = inputYourRates("Input your history rate: ");
        float physics = inputYourRates("Input your physics rate: ");
        float biology = inputYourRates("Input your biology rate: ");

        float result = countAverageRate(chemistry, math, history, physics, biology);
        printTypeScholarship(result);

    }

    private static float inputYourRates(String message) throws IOException {
        System.out.println(message);
        float rates = Integer.parseInt(reader.readLine());
        return rates;
    }

    private static float countAverageRate(float a, float b, float c, float d, float e) {
        float result = (a + b + c + d + e) / 5;
        if(a > 12){
            System.out.println("Please provide a number between 6-12");
        }

        return result;
    }

    private static void printTypeScholarship(float result){
        if (result >= 10) {
            System.out.println("Your average points is: " + result + " congratulations!!! You'll get increased scholarship! :D");
        } else if (result >= 8) {
            System.out.println("Your average points is: " + result + " you'll get scholarship. :)");
        }else {
            System.out.println("Your average points is: " + result + " you're such a loser! :( You'll get nothing and I can say more you'll pay for all.");
        }
    }

}
