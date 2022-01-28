package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "Witajcie! Kwadrat 10 to: " + policzKwadrat(10)
        );
        System.out.println("Policzone!");
    }
    public static int policzKwadrat(int liczba) {
        System.out.println("Liczymy kwadrat liczby " + liczba);
        return liczba * liczba;
    }
}

