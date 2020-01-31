package com.naldana;

import java.util.Objects;

//TODO (1) This class represent a real person; It shall store all the fields needed to identify a person, also it has
// to be able to do normal actions that a person can do in the system, like speak, sleep, walk, run...
public class Person {
    //TODO (2) Fields
    //TODO (3) Constructors
    //TODO (4) Methods
    //TODO (5) Setters and getters

    String name;
    int age;
    double height;
    String eyesColor;

    public Person() {
        name = "Unnamed";
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Person(String name, int age, double height, String eyesColor) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.eyesColor = eyesColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", eyesColor='" + eyesColor + '\'' +
                '}';
    }
}
