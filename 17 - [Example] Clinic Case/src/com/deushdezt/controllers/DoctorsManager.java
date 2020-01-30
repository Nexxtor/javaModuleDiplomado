package com.deushdezt.controllers;

import com.deushdezt.models.Doctor;
import com.deushdezt.models.Person;

public class DoctorsManager extends PeopleManager {

    @Override
    public Person newSpecificPerson() {
        return null;
    }

    @Override
    public void setPersonData(Person person, boolean isNewRegister) {

    }
}
