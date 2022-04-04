package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class TypyProste {
    public static void main(String[] args) {
        int numOfCl;
        byte numOfInd;
        double meanOfAll = 0;
        int[][] listOfCl;

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Wprowadź liczbę przedmiotów");
        numOfCl = inputScanner.nextInt();
        listOfCl = new int[numOfCl][];

        for(int i = 0; i < numOfCl; i++) {
            System.out.println("Wprowadź liczbę ocen dla przedmiotu nr:" + (i + 1));
            numOfInd = inputScanner.nextByte();
            listOfCl[i] = new int[numOfInd];
            for (int j = 0; j < numOfInd; j++) {
                System.out.println("Wprowadź ocenę nr: " + (j + 1) + " dla przedmiotu nr: " + (i + 1));
                listOfCl[i][j] = inputScanner.nextInt();
            }
            double mean = Arrays.stream(listOfCl[i]).average().orElse(Double.NaN);
            System.out.println("-------- średnia z ocen -----------");
            System.out.println("średnia dla przedmiotu nr: " + (i + 1) + " wynosi " + String.format("%.2f", mean) + "\n");
            meanOfAll += mean;
            }

        System.out.println("Pełna tabela ocen: " + Arrays.deepToString(listOfCl) + "\n");
        System.out.printf("średnia ze wszystkich przedmiotów: %.2f", meanOfAll/numOfCl);
        System.out.println("------- Koniec programu --------");
        }

    }

