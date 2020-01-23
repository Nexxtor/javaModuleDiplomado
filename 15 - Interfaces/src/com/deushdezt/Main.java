package com.deushdezt;

import com.deushdezt.animals.Animal;
import com.deushdezt.animals.Cat;
import com.deushdezt.animals.Duck;
import com.deushdezt.animals.Parrot;
import com.deushdezt.machines.Car;
import com.deushdezt.machines.Helicopter;
import com.deushdezt.machines.Machine;
import com.deushdezt.machines.Plane;

public class Main {

    public static void main(String[] args) {
        Flyable[] flyingThings = {
                new Parrot(),
                new Duck(),
                new Plane(),
                new Helicopter()
        };

        Animal[] animals = {
                new Parrot(),
                new Cat(),
                new Duck()
        };

        Machine[] machines = {
                new Helicopter(),
                new Car(),
                new Plane()
        };

        System.out.println("--------------------------");
        System.out.println("Showing only Flying Things");
        System.out.println("--------------------------");

        for(Flyable flyingThing : flyingThings){
            flyingThing.fly();
        }

        System.out.println("\n--------------------------");
        System.out.println("Showing animals that can fly");
        System.out.println("--------------------------");

        for(Animal animal : animals){
            if(animal instanceof Flyable){
                ((Flyable) animal).fly();
            }
        }

        System.out.println("\n--------------------------");
        System.out.println("Showing animals that can fly");
        System.out.println("--------------------------");

        for(Machine machine : machines){
            if(machine instanceof Flyable){
                ((Flyable) machine).fly();
            }
        }
    }
}
