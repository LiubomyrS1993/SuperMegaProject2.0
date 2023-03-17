package Lesson10;

import java.util.Random;

public class Task2HomeWork {

    public static void main(String[] args) {
        int arr[][] = new int[5][5];
        Random rand = new Random();
        randomNumbers(arr, rand);
        System.out.print("\n");
        outputNegativeNumbers(arr);

    }

    private static void outputNegativeNumbers(int[][] arr) {
        for(int i = 0; i<5; i++){
            for( int j = 0; j<5; j++){
                if (arr[i][j]<0)
                    System.out.print(i+" "+j+", ");

            }
        }
    }

    private static void randomNumbers(int[][] arr, Random rand) {
        for(int i = 0; i<5; i++){
            for( int j = 0; j<5; j++){
                arr[i][j]= rand.nextInt(10)-5;
                System.out.print(arr[i][j]+" "+"\t");

            }
            System.out.print("\n");
        }
    }

}
