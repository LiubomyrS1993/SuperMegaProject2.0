package Lesson9;

import java.util.Arrays;

public class HomeWork2 {

    public static void main(String[] args) {

        int[] x = {1, 0, 2, 0, 3, 0};
        bubble(x);
        System.out.println(Arrays.toString(x));
    }

    private static void bubble(int[] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {

                if (x[j] > x[i]) {
                    int temp = x[j];
                    x[j] = x[i];
                    x[i] = temp;

                }

            }

        }
    }
}
