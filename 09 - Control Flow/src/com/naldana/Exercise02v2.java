package com.naldana;

public class Exercise02v2 {

    public static void main(String[] args) {
        int maxDistance = 10;  // Keep in mine the unit of measure, in this case is km
        int distanceToHome = 11;

        if (distanceToHome > maxDistance) {
            System.out.println("Distance from the store to your home is");
            System.out.println(" more than " + maxDistance + "km away");
            System.out.println("Free delivery is unavailable");
        } else {
            System.out.println("Distance from the store to your home is");
            System.out.println("  within " + maxDistance + "km away.");
            System.out.println("You get free delivery!");
        }
    }
}
