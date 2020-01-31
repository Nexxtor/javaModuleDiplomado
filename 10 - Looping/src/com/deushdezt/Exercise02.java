package com.deushdezt;

public class Exercise02 {
    public static void main(String[] args) {
        System.out.println("Printing numbers from 19 to 0");

        for (int i = 19; i >= 0; i--) {
            if (i % 2 == 0)
                System.out.println("Iteration: " + i);
        }

        System.out.println("\nPrinting numbers from 20 to 1");

        for (int i = 19; i >= 0; i--) {
            System.out.println("Iteration: " + (i + 1));
        }
    }
}
