package com.naldana;

public class Main {
    
    // TODO (1): Instructions: Use the Pythagorean Theorem to find the unknown side of a right triangle
    // TODO (2): You know a and b side
    public static void main(String[] args) {
        // TODO (1): First you need the data
        double cathetusA  = 10;
        double cathetusB = 20;
        // TODO (2): Do calculations
        double sum =  Math.pow(cathetusA,2) + Math.pow(cathetusB,2);
        double hypotenuse = Math.sqrt(sum);
        // TODO (3): Show the answer to the user
        System.out.println("The answer is: " +  hypotenuse);
    }
}
