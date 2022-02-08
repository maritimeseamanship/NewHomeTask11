package com.katetaier11;

import java.util.Random;

public class Matrix {
    public static final Random RANDOM = new Random();
    public static final int COUNT = 10;

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = RANDOM.nextInt(100) + 1;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void swapColumns(int[][] matrix, int i, int j) {
        for (int n = 0; n < matrix.length; n++) {
            int temp = matrix[n][i - 1];
            matrix[n][i - 1] = matrix[n][j - 1];
            matrix[n][j - 1] = temp;
        }
        for (int m = 0; m < matrix.length; m++) {
            for (int k = 0; k < matrix[0].length; k++) {
                System.out.print(matrix[m][k] + " ");
            }
            System.out.println();
        }
    }

    public static void swapRows(int[][] matrix, int i, int j) {
        for (int n = 0; n < matrix.length; n++) {
            int temp = matrix[i - 1][n];
            matrix[i - 1][n] = matrix[j - 1][n];
            matrix[j - 1][n] = temp;
        }
        for (int m = 0; m < matrix.length; m++) {
            for (int k = 0; k < matrix[0].length; k++) {
                System.out.print(matrix[m][k] + " ");
            }
            System.out.println();
        }
    }

    public static void multiplyMatrix(int[][] matrix, int value) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = matrix[i][j] * value;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] toArray(int[][] matrix) {
        int[] newArray = new int[COUNT * COUNT];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                newArray[i * COUNT + j] = matrix[i][j];
            }
        }
        return newArray;
    }

    public static int max(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}