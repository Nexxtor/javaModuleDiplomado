package com.deushdezt;

public class Exercise01 {
    //Recursion example

    public static void main(String[] args) {
        long fact = factorial(10);
        System.out.println("Test 1 = " + fact);

        fact =  factorial(5);
        System.out.println("Test 2 = " + fact);

        fact =  factorial(1);
        System.out.println("Test 3 = " + fact);

        fact =  factorial(0);
        System.out.println("Test 4 = " + fact);

    }

    private static long factorial(long n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
