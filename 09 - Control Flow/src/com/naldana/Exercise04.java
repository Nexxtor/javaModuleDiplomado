package com.naldana;

public class Exercise04 {

    //TODO (1) Refactor the solution of exercise 3 using logical operators instead of nested conditions
    public static void main(String[] args) {
        int age = 20, minAge = 18;

        double currency = 20.00,
                ticketPrice = 5.50;

        if (age >= minAge && currency >= ticketPrice) {
            System.out.println("Welcome to the cinema");
        } else {
            System.out.println("You don't have the authorization to watch this movie");
        }
    }

}
