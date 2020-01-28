/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naldana.clinica.model;

import java.util.Objects;

/**
 *
 * @author nexxtor <nestor.aldana1@gmail.com>
 */
public class Persona {

    protected String identificacion; // Algun tipo de valor alphanumerico, sera usado com ID
    protected String nombres;
    protected String apellidos;
    protected String genero;

    public Persona() {
    }

    public Persona(String identificacion, String nombres, String apellidos, String genero) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Identificacion: " + identificacion + ", Nombres: " + nombres + ",Apellidos: " + apellidos + "Genero: " + genero;
    }

    /* Lo sigueintes dos métodos se sobre escriben para
     * comparar los objetos por su identifacion y 
     * facilitar la comparación y ordenamiente de objetos Persona 
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.identificacion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.identificacion, other.identificacion)) {
            return false;
        }
        return true;
    }

}
