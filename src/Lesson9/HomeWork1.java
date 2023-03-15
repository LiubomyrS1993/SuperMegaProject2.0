package Lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HomeWork1 {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int[] arr1 = inputRandomNumber(7);
        int[] arr2 = inputNumberFromConsole(7);
        int count = countEqualElements(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("Number of equal elements: " + count);
    }

    private static int[] inputRandomNumber(int n) {
        int[] arr1 = new int[7];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = getRandom();
            System.out.print(arr1[i]);

        }
        return arr1;
    }

    private static int[] inputNumberFromConsole(int n) throws IOException {
        int[] arr2 = new int[7];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("\ninput a number: ");
            arr2[i] = Integer.parseInt(READER.readLine());

        }
        return arr2;
    }

    public static int countEqualElements(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
                if (arr1[i] == arr2[i]) {
                    count++;
                }
            }

        return count;
    }

    private static int getRandom() {
        int random = (int) (Math.random() * 10);
        return random;
    }

}
