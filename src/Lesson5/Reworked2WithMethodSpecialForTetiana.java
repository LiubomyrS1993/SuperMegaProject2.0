package Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reworked2WithMethodSpecialForTetiana {

    public static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int height = inputBagLuggage("Input height: ");
        int weight = inputBagLuggage("Input weight: ");
        int length = inputBagLuggage("Input length: ");

        String message = printDimensionsForLuggage(height, weight, length) ?
                ("Cool bro your bag/backpack is suitable for hand luggage") :
                ("Yom must pay for your luggage");
        System.out.println(message);


    }

    public static int inputBagLuggage(String message) throws IOException {
        System.out.println(message);
        int dimensions = Integer.parseInt(reader.readLine());
        return dimensions;
    }

    public static boolean printDimensionsForLuggage(int height, int width, int length) {
        return height <= 40 && width <= 20 && length <= 55 || height <= 53 && width <= 22 && length <= 40;
    }

}
