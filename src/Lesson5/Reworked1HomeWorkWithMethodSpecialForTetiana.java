package Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reworked1HomeWorkWithMethodSpecialForTetiana {

    public static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        averageRate();

    }


    private static float averageRate() throws IOException {

        System.out.println("Provide your math points: ");


        float math1 = Integer.parseInt(reader.readLine());
        System.out.println("Your math points is: " + math1);

        System.out.println("Provide your biology points: ");

        float biology1 = Integer.parseInt(reader.readLine());
        System.out.println("Your biology points is: " + biology1);

        System.out.println("Provide your history points: ");

        float history1 = Integer.parseInt(reader.readLine());
        System.out.println("Your history points is: " + history1);

        System.out.println("Provide your chemistry points: ");

        float chemistry1 = Integer.parseInt(reader.readLine());
        System.out.println("Your chemistry points is: " + chemistry1);

        System.out.println("Provide your physics points: ");

        float physics1 = Integer.parseInt(reader.readLine());
        System.out.println("Your physics points is: " + physics1);

        float result1 = (math1 + biology1 + history1 + chemistry1 + physics1) / 5.0f;

        if (result1 >= 10) {
            System.out.println("Your average points is: " + result1 + " congratulations!!! You'll get increased scholarship! :D");
        } else if (result1 >= 8) {
            System.out.println("Your average points is: " + result1 + " you'll get scholarship. :)");
        }else {
            System.out.println("Your average points is: " + result1 + " you're such a loser! :( You'll get nothing and I can say more you'll pay for all.");
        }

        return result1;
    }

}
