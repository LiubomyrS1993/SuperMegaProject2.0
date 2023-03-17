package Lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1HomeWork {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.print("Enter number of rows for Matrix: ");
        int sourceRows = Integer.parseInt(READER.readLine());
        System.out.print("Enter number of columns for Matrix: ");
        int sourceColumns = Integer.parseInt(READER.readLine());
        int[][] sourceMatrix = new int[sourceRows][sourceColumns];

        int[][] transposedMatrix = new int[sourceColumns][sourceRows];

        matrix(sourceMatrix);
        tMatrix(sourceMatrix, transposedMatrix);
    }

    public static int[][] matrix(int[][] matrix) throws IOException {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter value for [" + i + "][" + j + "]: ");
                matrix[i][j] = Integer.parseInt(READER.readLine());
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public static int[][] tMatrix(int[][] matrix, int[][] tMatrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tMatrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < tMatrix.length; i++) {
            for (int j = 0; j < tMatrix[i].length; j++) {
                System.out.print(tMatrix[i][j] + " ");
            }
            System.out.println();
        }
        return tMatrix;

    }

}
