package com.naldana;

public class Payment {

    public static void main(String[] args) {
        boolean cash = true; // payment type

        if (cash) {
            System.out.println("Cash Payment");
        } else {
            System.out.println("Debit Card Payment");
        }

        if (!cash) {
            System.out.println("Debit Card Payment");
        } else {
            System.out.println("Cash Payment");
        }
    }
}
