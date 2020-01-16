package com.naldana;

public class Overloading {
    public static void main(String[] args) {
        Age age = new Age();
        age.setAge(12.5);
        System.out.println(age.getAge());
        age.setAge(9, 3);
        System.out.println(age.getAge());
    }
}
