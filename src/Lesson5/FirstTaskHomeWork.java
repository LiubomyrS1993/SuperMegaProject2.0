package Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTaskHomeWork {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Provide your math points: ");


        float math = Integer.parseInt(reader.readLine());
        System.out.println("Your math points is: " + math);

        System.out.println("Provide your biology points: ");

        float biology = Integer.parseInt(reader.readLine());
        System.out.println("Your biology points is: " + biology);

        System.out.println("Provide your history points: ");

        float history = Integer.parseInt(reader.readLine());
        System.out.println("Your history points is: " + history);

        System.out.println("Provide your chemistry points: ");

        float chemistry = Integer.parseInt(reader.readLine());
        System.out.println("Your chemistry points is: " + chemistry);

        System.out.println("Provide your physics points: ");

        float physics = Integer.parseInt(reader.readLine());
        System.out.println("Your physics points is: " + physics);

        float averageGP = (math + biology + history + chemistry + physics) / 5.0f;

        if (averageGP >= 10) {
            System.out.println("Your average points is: " + averageGP + " congratulations!!! You'll get increased scholarship! :D");
        } else if (averageGP >= 8) {
            System.out.println("Your average points is: " + averageGP + " you'll get scholarship. :)");
        }else {
            System.out.println("Your average points is: " + averageGP + " you're such a loser! :( You'll get nothing and I can say more you'll pay for all.");
        }
    }

}
