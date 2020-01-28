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
public class Medico extends Persona {

    private String especialidad;

    public Medico() {
    }

    public Medico(String identificacion, String nombres, String apellidos, String genero, String especialidad) {
        super(identificacion, nombres, apellidos, genero);
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + " Especialidad: " + especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
