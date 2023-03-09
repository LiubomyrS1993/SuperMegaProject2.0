package Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reworked2WithMethodSpecialForTetiana {

    public static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        airLuggage();

    }
    public static void airLuggage() throws IOException {

        System.out.println("Provide your height of baggage(centimeter): ");
        int height = Integer.parseInt(reader.readLine());
        System.out.println("your height of baggage is: " + height);

        System.out.println("Provide your width of baggage(centimeter): ");
        int width = Integer.parseInt(reader.readLine());
        System.out.println("your width of baggage is: " + width);

        System.out.println("Provide your length of baggage(centimeter): ");
        int length = Integer.parseInt(reader.readLine());
        System.out.println("your length of baggage is: " + length);


        if(height <= 40 && width <= 20 && length <= 55){

            System.out.println("Cool bro your bag/backpack is suitable for hand luggage");

        }
        else if (height <= 53 && width <= 22 && length <= 40){
            System.out.println("Cool bro your bag/backpack is suitable for hand luggage");
        }
        else{
            System.out.println("Yom must pay for your luggage");
        }

    }

}
