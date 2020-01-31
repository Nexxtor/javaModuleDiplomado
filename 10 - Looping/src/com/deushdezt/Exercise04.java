package com.deushdezt;

public class Exercise04 {
    public static void main(String[] args) {
        String[] letters = {"A", "B", "C", "D", "E", "F", "G"};

        for(int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }

        System.out.println("Printing letters from A to G");
        for (String letter : letters) {
            System.out.println("Letter: " + letter);
        }
    }
}
