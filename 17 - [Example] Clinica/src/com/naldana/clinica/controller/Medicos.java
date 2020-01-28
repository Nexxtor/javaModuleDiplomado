/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naldana.clinica.controller;

import javax.swing.JOptionPane;
import com.naldana.clinica.model.Medico;
import com.naldana.clinica.model.Persona;

/**
 *
 * @author nexxtor <nestor.aldana1@gmail.com>
 */
public class Medicos extends Personas {

    @Override
    public Persona nueva() {
        return new Medico();
    }

    @Override
    public void obtenerDatosTeclado(Persona persona, boolean nuevo) {
        Medico medico = (Medico) persona;

        if (nuevo) { // Si es nuevo se pide su identificación
            medico.setIdentificacion(JOptionPane.showInputDialog(null, "Ingrese el número de identifación de medico"));
        }

        medico.setNombres(JOptionPane.showInputDialog(null, "Ingrese los nombres de medico"));
        medico.setApellidos(JOptionPane.showInputDialog(null, "Ingrese los apellidos de medico"));
        medico.setGenero(JOptionPane.showInputDialog(null, "Ingrese el genero de medico"));
        medico.setEspecialidad(JOptionPane.showInputDialog(null, "Ingrese el genero de medico"));

    }

}
