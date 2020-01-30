package com.deushdezt.strategy.strategies;

import com.deushdezt.strategy.models.Person;

import javax.swing.*;

public class GUIStrategy implements InputStrategy{
    @Override
    public Person getPerson() {
        Person person = new Person();

        do {
            try {

                String text = "Id: ";
                person.setId(JOptionPane.showInputDialog(text));

                text = "name:" ;
                person.setName(JOptionPane.showInputDialog(text));

                text = "Age:" ;
                person.setAge(Integer.parseInt(JOptionPane.showInputDialog(text)));

                text = "Gender:" ;
                person.setGender(JOptionPane.showInputDialog(text).charAt(0));

                break;
            } catch (Exception e) {
                System.out.println("Input error");
            }
        } while (true);

        return person;
    }
}
