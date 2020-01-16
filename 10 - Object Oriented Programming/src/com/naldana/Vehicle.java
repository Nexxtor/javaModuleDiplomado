package com.naldana;

public class Vehicle {
    int quantityWheel;
    int maxSpeed;

    // TODO: A method white the same nam of the class it's call Constructor
    public Vehicle() {
        quantityWheel = 0;
        maxSpeed = 0;
    }
    // TODO: You can write different version of a method but you need change the arguments quantity or types
    public Vehicle(int quantityWheel, int maxSpeed) {
        this.quantityWheel = quantityWheel;
        this.maxSpeed = maxSpeed;
    }

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