package com.deushdezt;

import com.deushdezt.animals.Duck;
import com.deushdezt.animals.Parrot;
import com.deushdezt.machines.Helicopter;
import com.deushdezt.machines.Plane;

public class Main {

    public static void main(String[] args) {
        Flyable[] flyingThings = {
                new Parrot(),
                new Duck(),
                new Plane(),
                new Helicopter()
        };

        for(Flyable flyingThing : flyingThings){
            flyingThing.fly();
        }
    }
}
