package com.deushdezt;

public class Exercise06 {
    public static void main(String[] args) {
        int x = 40, y = 3;

        while ( x % y != 0) {
            System.out.println("Values-> x=" + x + ", y=" + y);
            x--;
        }

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
