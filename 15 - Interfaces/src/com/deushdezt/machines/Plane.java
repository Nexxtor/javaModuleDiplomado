package com.deushdezt.machines;

import com.deushdezt.Flyable;

public class Plane extends Machine implements Flyable {
    @Override
    public void fly() {
        System.out.println("Siiiiiummm... Flying Plane");
    }
}
