package Lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork2Task {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int[] arr1 = new int[20];
        getNumbers(arr1);
    }

    private static void getNumbers(int[] arr1) {

        System.out.println("Enter 20 numbers: ");
        for (int i = 0; i < arr1.length; i++) {
            try {
                arr1[i] = Integer.parseInt(READER.readLine());
            } catch (Exception e) {
                System.out.println("Please enter a number");
                i--;
            }
        }

        int[] arr2 = new int[10];
        int[] arr3 = new int[10];

        inputArray(arr1, arr2, arr3);

        subArrays("First sub-array: ", arr2);

        subArrays("\nSecond sub-array: ", arr3);
    }

    private static void inputArray(int[] arr1, int[] arr2, int[] arr3) {
        for (int i = 0; i < arr1.length; i++) {
            if (i < arr1.length / 2) {
                arr2[i] = arr1[i];
            } else {
                arr3[i - arr1.length / 2] = arr1[i];
            }
        }
    }

    private static void subArrays(String s, int[] arr2) {
        System.out.print(s);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
