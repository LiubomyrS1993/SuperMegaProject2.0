package Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondTaskHomeWork {

    public  static  final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        int number1 = getInt();
        String operation = getOperation();
        int number2 = getInt();
        int result = calc(number1, operation, number2);

        System.out.println("Result: " + result);
    }

    public static int getInt() throws IOException {
        System.out.println("enter number: ");
        int num1 = Integer.parseInt(reader.readLine());
        return num1;
    }

    public static String getOperation() throws IOException {
        BufferedReader op = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter operation: ");
        String operation = op.readLine();
        return operation;
    }


    public static int calc(int num1, String operation, int num2) throws IOException {
        int result;
        switch (operation){
            case "+":
                result = num1+num2;
                break;
            case "-":
                result = num1-num2;
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                result = num1/num2;
                break;
            default:
                System.out.println("Bad Request 404");
                result = calc(num1, getOperation(), num2);
        }
        return result;
    }


}
