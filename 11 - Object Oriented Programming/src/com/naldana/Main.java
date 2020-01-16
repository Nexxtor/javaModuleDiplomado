package com.naldana;

public class Main {

    public static void main(String[] args) {
	    Vehicle car = new Vehicle();
	    Vehicle biky =  new Vehicle();

	    biky.quantityWheel =  2;
		biky.maxSpeed = 20;

		car.setMaxSpeed(200);
		car.setQuantityWheel(4);

	    // TODO: Print in console the car and bike data in console
    }
}
