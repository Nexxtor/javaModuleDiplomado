package com.naldana;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);

    	Person[] people = new Person[2];

	 	for(int i = 0; i < people.length; i++){
	 		Person personTemp = new Person();

			System.out.println("Ingresando persona " + (i+1) + ":\n");

			System.out.print("Nombre: ");
	 		personTemp.setName(input.nextLine());

			System.out.print("Edad: ");
			personTemp.setAge(input.nextInt());

			input.nextLine(); //Limpieza del buffer

			System.out.print("Color de ojos: ");
			personTemp.setEyesColor(input.nextLine());

			System.out.print("Altura: ");
			personTemp.setHeight(input.nextDouble());

			input.nextLine(); //Limpieza del buffer
			System.out.println();

			people[i] = personTemp;
		}

	 	for(Person person : people){
			System.out.println(person.getName() + "\n");
		}
    }
}
