package com.deushdezt.factory.models;

public class SiberianHusky implements Dog{
    @Override
    public void speak() {
        System.out.println("The Siberian Husky says \"Dude, what's up?\"");
    }
}
