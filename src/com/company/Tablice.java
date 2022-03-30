package com.company;

public class Tablice {

    public static void main(String[] args) {
        int[][] arrayTwoDim = {{1, 2}, {3, 4}, {5, 6}, {7}, {8}};

        System.out.println(sumArray(arrayTwoDim));
        System.out.println(arrayTwoDim.length);

    }

    static int sumArray(int[][] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length -1; j++) {
                sum = sum + numbers[i][j];
                System.out.println(i + " " + j);
                System.out.println("-------------");
            }
        }
        return sum;
    }
}
