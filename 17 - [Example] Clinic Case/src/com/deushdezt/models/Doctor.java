package com.deushdezt.models;

import com.deushdezt.exeptions.CodeFormatException;

public class Doctor extends Person {
    private String doctorCode, specialty;

    public Doctor() {
    }

    public Doctor(String id, String firstname, String lastname, int age, char gender, String medicCode, String specialty) {
        super(id, firstname, lastname, age, gender);
        this.doctorCode = medicCode;
        this.specialty = specialty;
    }

    public String getMedicCode() {
        return doctorCode;
    }

    public void setMedicCode(String medicCode) throws CodeFormatException {
        String medicCodePattern = "^M[0-9]{3}$";

        if(medicCode.matches(medicCodePattern)){
            this.doctorCode = medicCode;
        }else {
            throw new CodeFormatException("The code doesn't match with the format");
        }

    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Doctor:" +
                super.toString() + '\'' +
                "doctorCode='" + doctorCode + '\'' +
                ", specialty='" + specialty + '\'';
    }
}
