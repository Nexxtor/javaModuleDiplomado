package com.naldana;

public class Exercise03 {

    // TODO (1): Say if a person can watch a movie rated as R base on his age and money
    public static void main(String[] args) {
        int age = 20,
            minAge=18; // years old
        double currency = 7.00; // dollars
        double priceTicket = 5.0;

        if (currency >= priceTicket) {
            System.out.println(" You have enough money ");
            if( age <= minAge) {
                System.out.printf("But you are to young");
            } else {
                System.out.println("Welcome to the cinema");
            }

        }
    }
}
