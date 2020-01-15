package com.naldana;

public class Exercise05 {
    //TODO
    public static void main(String[] args) {

        int shortDiscountItems = 10;
        int mediumDiscountItems = 60;
        int largeDiscountItems = 100;

        int currentDiscount;
        int quantity = 125;

        if (quantity >= largeDiscountItems){
            currentDiscount = 35;
        } else if (quantity >= mediumDiscountItems){
            currentDiscount = 25;
        } else if (quantity >= shortDiscountItems){
            currentDiscount = 5;
        } else {
            currentDiscount =0;
        }

        System.out.println("You have a current discount of " + currentDiscount + "%");
    }
}
