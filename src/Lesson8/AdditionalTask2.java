package Lesson8;

import java.util.Arrays;

public class AdditionalTask2 {

    public static void main(String[] args) {
        int randomPin[] = {1, 2, 3, 4};
        int[] result = new int[randomPin.length];
        int count = 0;
        count = getCount(randomPin, result, count);
        System.out.println("iterations " + count);
        System.out.println(Arrays.toString(result));


    }

    private static int getCount(int[] randomPin, int[] result, int count) {
        for (int i = 0; i < randomPin.length; i++) {
            int random = 0;
            while (randomPin[i] != random) {
                random = getRandom();
                count++;
            }
            count++;
            result[i] = random;

        }
        return count;
    }

    private static int getRandom() {
        int random = (int) (Math.random() * 10);
        return random;
    }


}
