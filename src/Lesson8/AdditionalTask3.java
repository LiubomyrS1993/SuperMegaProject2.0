package Lesson8;

public class AdditionalTask3 {

    public static void main(String[] args) {

        int[] x = {1, 6, 5, 7, 10, 9, 8, 3, 2, 4};
        int index = 0;
        int max = x[index];

        index = getIndex(x, index, max);
        System.out.println("The killer is number " + index);
    }

    private static int getIndex(int[] x, int index, int max) {
        for (int i = 0; i < x.length; i++) {

            if (x[i] > max) {
                max = x[i];
                index = i + 1;
            }

        }
        return index;
    }

}
