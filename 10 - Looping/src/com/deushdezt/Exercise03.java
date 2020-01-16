package com.deushdezt;

public class Exercise03 {
    public static void main(String[] args) {
        System.out.println("Printing even numbers from 0 to 20");

        for (int i = 0; i <= 20; i++) {
            if(i % 2 == 0){
                System.out.println("-> " + i);
            }
        }
    }
}
