package com.naldana;

public class MainInheritance {

    public static void main(String[] args) {
        Tablet myTab = new Tablet();
        myTab.setScreenSize(3.0);
        myTab.setCpuSpeed(1.8);
        System.out.println("myTab.getCpuSpeed() = " + myTab.getCpuSpeed());
        System.out.println("myTab.getScreenSize() = " + myTab.getScreenSize());

    }
}
