package com.naldana;

public class Main {

    // TODO (1): You have lucky!, oder company offer to you a new job. Make a program to find out the best salary.
    public static void main(String[] args) {
        // TODO (2): Declare three variable a, b, and m. Initialize with the values 900, 1000 and 0 respectively.
        double a = 900,
                b = 1000,
                m = 0; // The maximum salary
        // TODO (3): Create a String variable r, it should contain the output message  to be printed. you can be creative.
            // "The best option of AA and BB is MM
        String r = "The best option of " + a + " and " + b + " is ";
        // TODO (4): Use max() method to obtain the maximum of the two salary value and store in m.
        m = Math.max(a,b);
        // TODO (5): Print the results.
        System.out.println(r + m);
     }
}
