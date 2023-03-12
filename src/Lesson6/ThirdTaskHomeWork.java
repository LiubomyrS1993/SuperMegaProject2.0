package Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThirdTaskHomeWork {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {

        System.out.println("enter number: ");
        int apples = Integer.parseInt(READER.readLine());

        int largeJars = countBigJars(apples);
        int leftOver = apples % 5;

        int mediumJars = countMediumJars(leftOver);
        leftOver = leftOver % 3;

        int smallJars = countSmallJars(leftOver);

        System.out.println("Large jars - " + largeJars);
        System.out.println("Medium jars - " + mediumJars);
        System.out.println("Small jars - " + smallJars);
    }

    public static int countBigJars(int apples) {
        return apples / 5;
    }

    public static int countMediumJars(int leftOver) {
        return leftOver / 3;
    }

    public static int countSmallJars(int leftOver) {
        return leftOver % 3;
    }


}
