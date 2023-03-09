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

        printDimensionsForLuggage(height, weight, length);
    }
    public static int inputBagLuggage(String message) throws IOException {
        System.out.println(message);
        int dimensions = Integer.parseInt(reader.readLine());
        return dimensions;
    }

    public static void printDimensionsForLuggage(int height, int width, int length){

        if (height <= 40 && width <= 20 && length <= 55){
            System.out.println("Cool bro your bag/backpack is suitable for hand luggage");

        } else if (height <= 53 && width <= 22 && length <= 40){
            System.out.println("Cool bro your bag/backpack is suitable for hand luggage");

        } else{
            System.out.println("Yom must pay for your luggage");
        }
    }

}
