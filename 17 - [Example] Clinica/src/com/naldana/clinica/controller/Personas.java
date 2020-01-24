/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naldana.clinica.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.naldana.clinica.model.Persona;

/**
 * Gestiona los inster, modificar, eliminar y mostar datos de persona, exigue
 * implimentacion abstracta de leer de teclado y de creacion de instancia de
 * persona, asi permitira la administración de médico y paciente evitando
 * repetir código
 *
 * @author nexxtor <nestor.aldana1@gmail.com>
 */
public abstract class Personas implements Gestionar {

    // Lista de todas las personas
    private final ArrayList<Persona> personas;

    public Personas() {
        personas = new ArrayList<>();
    }

    @Override
    public boolean registrar() {
        Persona persona = nueva();
        obtenerDatosTeclado(persona, true);
        // Para no agregar personas con la misma identificacion
        if (!personas.contains(persona)) {
            personas.add(persona);
            return true;
        }
        return false;
    }

    @Override
    public void mostrar() {
        if (personas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nada que mostrar");
        } else {

            String datosPersona = "";
            for (Persona persona : this.personas) {
                datosPersona += persona.toString() + "\n";
            }
            JOptionPane.showMessageDialog(null, datosPersona);
        }
    }

    @Override
    public boolean modificar(String id) {
        Persona personaBuscada = nueva();

        // Esto funciona por que se modifico el metodo equals y hashcode
        personaBuscada.setIdentificacion(id); // Para buscar con la identificacion
        int index = personas.indexOf(personaBuscada);

        if (index < 0) {
            return false;
        }
        // Se pasa el paciente que se requiere modificar
        obtenerDatosTeclado(personas.get(index), false);
        return true;
    }

    @Override
    public boolean eliminar(String id) {
        // Buscamos si existe
        Persona persona =  nueva();
        persona.setIdentificacion(id);

        return personas.remove(persona);
    }
    
    /**
     * Permite saber si un objeto se encuentra el la lista
     * @param o
     * @return true si se encuentra en cualquier otro caso false
     */
    public boolean containts(Persona o){
        return personas.contains(o);
    }

    /**
     * Crear una persona a partir de infomacion ingresada por el usuario
     *
     * @return Persona
     */
    public abstract Persona nueva();

    /**
     * Permite leer desde teclado la inforamcion de un paciente
     *
     * @param paciente
     * @param nuevo
     */
    public abstract void obtenerDatosTeclado(Persona paciente, boolean nuevo);
}
