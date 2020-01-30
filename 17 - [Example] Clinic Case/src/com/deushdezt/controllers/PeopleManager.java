package com.deushdezt.controllers;

import com.deushdezt.models.Person;

import java.util.ArrayList;
import java.util.List;

import static javafx.scene.input.KeyCode.T;

public abstract class PeopleManager implements Manageable {
    private List<Person> people;

    public PeopleManager() {
        people = new ArrayList<>();
    }

    @Override
    public boolean register() {
        return false;
    }

    @Override
    public boolean update(String code) {
        return false;
    }

    @Override
    public boolean delete(String code) {
        return false;
    }

    @Override
    public void showAll() {

    }

    public abstract Person newSpecificPerson();

    public abstract void setPersonData(Person person, boolean isNewRegister);
}
