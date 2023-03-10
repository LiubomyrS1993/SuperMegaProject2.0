package Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTaskHomeWork {

    public static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int num1 = inputNumber("Input your first number: ");
        int num2 = inputNumber("Input your second number: ");
        int num3 = inputNumber("Input your third number: ");

        countMin(num1, num2, num3);
    }

    private static int inputNumber(String message) throws IOException {
        System.out.println(message);
        float number = Integer.parseInt(reader.readLine());
        return (int) number;
    }

    public static void countMin(int firstNumber, int secondNumber, int thirdNumber) {
        if (secondNumber >= firstNumber && firstNumber <= thirdNumber)
            System.out.println("Min number is " + firstNumber);
        else if (firstNumber >= secondNumber && secondNumber <= thirdNumber) {
            System.out.println("Min number is " + secondNumber);
        } else {
            System.out.println("Min number is " + thirdNumber);
        }

    }

}
