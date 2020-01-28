/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naldana.clinica.model;

/**
 *
 * @author nexxtor <nestor.aldana1@gmail.com>
 */
public class Paciente extends Persona {

    private int edad;

    public Paciente() {
        edad = 0; // Serivira para validar si se ingresa edad adecuada
    }

    public Paciente(String identificacion, String nombres, String apellidos, String genero, int edad) {
        super(identificacion, nombres, apellidos, genero);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString() + " Edad: " + edad;
    }

}
