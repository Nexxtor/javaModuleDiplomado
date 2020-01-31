package com.deushdezt;

public class Exercise05 {
    public static void main(String[] args) {
        String[] letters = { "D", "E", "F", "G",};

        System.out.println("Printing letters from A to G excluding E");
        for (String letter : letters) {
            if (letter.equals("E")) {
                break;
            }

            System.out.println("Letter: " + letter);
        }
    }
}
