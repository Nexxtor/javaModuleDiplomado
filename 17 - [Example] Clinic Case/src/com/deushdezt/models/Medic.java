package com.deushdezt.models;

public class Medic extends Person {
    private String medicCode, specialty;

    public Medic() {
    }

    public Medic(String id, String firstname, String lastname, int age, char gender, String medicCode, String specialty) {
        super(id, firstname, lastname, age, gender);
        this.medicCode = medicCode;
        this.specialty = specialty;
    }

    public String getMedicCode() {
        return medicCode;
    }

    public void setMedicCode(String medicCode) throws Exception {
        String medicCodePattern = "^M[0-9]{3}$";

        if(medicCode.matches(medicCodePattern)){
            this.medicCode = medicCode;
        }else {
            throw new Exception("The code doesn't match with the format");
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
        return "Medic:" +
                super.toString() + '\'' +
                "medicCode='" + medicCode + '\'' +
                ", specialty='" + specialty + '\'';
    }
}
