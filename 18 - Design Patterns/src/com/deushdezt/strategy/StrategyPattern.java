package com.deushdezt.strategy;

import com.deushdezt.strategy.contexts.InputStrategyContext;
import com.deushdezt.strategy.models.Person;

public class StrategyPattern {

    public static void main(String[] args) {
        InputStrategyContext input = new InputStrategyContext("GUI");

        Person person = input.getNewPerson();
        System.out.println(person.toString());

        input = new InputStrategyContext("CLI");

        person = input.getNewPerson();
        System.out.println(person.toString());
    }
}
