package com.naldana;

public class Main {

    public static void main(String[] args) {
        int i = 2;
        float f = 3.55f;
        // TODO (1) Basic operations
        System.out.println("i = " + i);
        i = 2 + 1; // Addition
        System.out.println("i = " + i);
        i = i * 2; // Multiplication
        System.out.println("i = " + i);
        i = i / 2; // Division
        System.out.println("i = " + i);
        i = i - 1; // Subtraction
        System.out.println("i = " + i);
        i = i % 2; // Modulus Operator (Divides left-hand operand by right-hand operand and returns remainder.)
        System.out.println("i = " + i);
        i++; // Increment one to i and save the result in i (i = i + 1)
        System.out.println("i = " + i);
        i--; // Decrement one to i and save the result in i  (i = i - 1)
        System.out.println("i = " + i);

        // TODO (2) Math operations
        f = Math.round(f);
        System.out.println("f = " + f);

        double c = Math.sqrt(f);
        System.out.println("c = " + c);

        float min = Math.min(4, f);
        System.out.println("min = " + min);
    }
}
