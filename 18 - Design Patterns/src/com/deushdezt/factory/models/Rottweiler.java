package com.deushdezt.factory.models;

public class Rottweiler implements Dog{
    @Override
    public void speak() {
        System.out.println("The Rottweiler says (in a deeper voice), \"arf\"");
    }
}
