package com.naldana;

public class Vehicle {
    int quantityWheel;
    int maxSpeed;
    int doors;


    // TODO: A method white the same nam of the class it's call Constructor
    public Vehicle() {
        quantityWheel = 0;
        maxSpeed = 0;
    }

    public void setDoors(int doors) { this.doors = doors;}
    public int getDoors() { return doors;}
    public int getQuantityWheel() {
        return quantityWheel;
    }

    public void setQuantityWheel(int quantityWheel) {
        this.quantityWheel = quantityWheel;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}