package com.deushdezt.machines;

import com.deushdezt.Flyable;

public class Helicopter extends Machine implements Flyable {
    @Override
    public void fly() {
        System.out.println("Tutututututu... Flying Helicopter");
    }
}
