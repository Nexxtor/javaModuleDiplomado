package com.deushdezt.animals;

import com.deushdezt.Flyable;

public class Duck extends Animal implements Flyable {
    @Override
    public void fly() {
        System.out.println("duck duck... Flying Duck");
    }
}
