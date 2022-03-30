package com.company;

public class Main {

    public static void main(String[] args) {
        var a = "Jest słonecznie";
        var b = "Jest ciepło";
        var c = "Ciśmienie w normie";

        System.out.println(a + "\n" + b + "\n" + c + "\n" + Integer.sum(a.length() + b.length(), c.length()));

    }
}

