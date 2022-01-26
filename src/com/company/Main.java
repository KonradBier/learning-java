package com.company;

public class Main {

    public static void main(String[] args) {
	    String raining1 = "AA";
	    String raining2 = "BB";
	    String raining3 = "CC";

        System.out.println(raining1);
        System.out.println(raining2);
        System.out.println(raining3);
        System.out.println("-----");

        raining2 = raining1;
        System.out.println(raining1);
        System.out.println(raining2);
        System.out.println("-----");

        raining1 = "DD";
        System.out.println(raining1);
        System.out.println(raining2);
        System.out.println("-----");

    }
}
