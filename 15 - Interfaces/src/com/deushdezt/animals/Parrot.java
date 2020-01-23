package com.deushdezt.animals;

import com.deushdezt.Flyable;

public class Parrot extends Animal implements Flyable {
    @Override
    public void fly() {
        System.out.println("Pi Pi Pi... Flying Parrot");
    }
}
