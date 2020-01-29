package com.deushdezt.models;

public class Patient extends Person {
    private String insuranceCode;

    public Patient() {
    }

    public Patient(String id, String firstname, String lastname, int age, char gender, String insuranceCode) {
        super(id, firstname, lastname, age, gender);
        this.insuranceCode = insuranceCode;
    }

    public String getInsuranceCode() {
        return insuranceCode;
    }

    public void setInsuranceCode(String insuranceCode) throws Exception {
        String insuranceCodePattern = "^S[0-9]{3}-[0-9]{3}$";

        if (insuranceCode.matches(insuranceCodePattern)) {
            this.insuranceCode = insuranceCode;
        } else {
            throw new Exception("The code doesn't match with the format");
        }
    }

    @Override
    public String toString() {
        return "Patient: " +
                super.toString() + '\'' +
                "insuranceCode='" + insuranceCode;
    }
}
