package Test;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] x = {3, 7, 8, 9, 10, 4};

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {

                if (x[j] > x[i]) {
                    int temp = x[j];
                    x[j] = x[i];
                    x[i] = temp;

                }

            }
            System.out.println(Arrays.toString(x));

        }
    }

}
