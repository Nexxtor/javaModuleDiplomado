package com.deushdezt;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte option;

        do {
            System.out.println("Menu");
            System.out.println("1. Add resource");
            System.out.println("2. Remove resource");
            System.out.println("3. Alter resource");
            System.out.println("0. Exit");
            System.out.print("Option: ");

            option = input.nextByte();

            switch (option){
                case 1:
                    System.out.println("Resource added");
                    break;
                case 2:
                    System.out.println("Resource removed");
                    break;
                case 3:
                    System.out.println("Resource altered");
                    break;
                default:
                    System.out.println("Good-bye!");
                    option = 0;
            }
        } while (option != 0);
    }
}
