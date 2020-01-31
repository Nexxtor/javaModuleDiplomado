package com.deushdezt.strategy.strategies;

import com.deushdezt.strategy.models.Person;

import java.util.Scanner;

public class CLIStrategy implements InputStrategy{
    @Override
    public Person getPerson() {
        Person person = new Person();
        Scanner input =  new Scanner(System.in);

        do {
            try {
                System.out.println("New person\n");

                System.out.print("Id: ");
                person.setId(input.nextLine());

                System.out.print("Name: ");
                person.setName(input.nextLine());

                System.out.print("Age: ");
                person.setAge(input.nextInt());

                input.nextLine();

                System.out.print("Gender: ");
                person.setGender(input.nextLine().charAt(0));

                break;
            } catch (Exception e) {
                System.out.println("Input error");
            }
        } while (true);

        return person;
    }
}
