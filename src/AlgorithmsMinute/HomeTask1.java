package AlgorithmsMinute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask1 {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static int[] shiftArray(int[] arr, int numOfPositions) {
        int[] shiftedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int newIndex = (i + numOfPositions) % arr.length;
            shiftedArr[newIndex] = arr[i];
        }

        return shiftedArr;
    }

    public static void main(String[] args) throws IOException {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Number of positions: ");
        int numOfPositions = Integer.parseInt(READER.readLine());

        int[] shiftedArr = shiftArray(arr, numOfPositions);
        System.out.print("Result: ");

        result(shiftedArr);

    }

    private static void result(int[] shiftedArr) {
        for (int i = 0; i < shiftedArr.length; i++) {
            System.out.print(shiftedArr[i]);
        }
    }

}
