/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naldana.clinica.controller;

import javax.swing.JOptionPane;
import com.naldana.clinica.model.Paciente;
import com.naldana.clinica.model.Persona;

/**
 *
 * @author nexxtor <nestor.aldana1@gmail.com>
 */
public class Pacientes extends Personas {

    @Override
    public Persona nueva() {
        return new Paciente();
    }

    @Override
    public void obtenerDatosTeclado(Persona persona, boolean nuevo) {
        Paciente paciente = (Paciente) persona;

        if (nuevo) { // Si es nuevo se pide su identificación
            paciente.setIdentificacion(JOptionPane.showInputDialog(null, "Ingrese el número de identifación de paciente"));
        }

        paciente.setNombres(JOptionPane.showInputDialog(null, "Ingrese los nombres de paciente"));
        paciente.setApellidos(JOptionPane.showInputDialog(null, "Ingrese los apellidos de paciente"));
        paciente.setGenero(JOptionPane.showInputDialog(null, "Ingrese el genero de paciente"));

        int edad = -1;
        while (edad < 0 || edad > 100) {  // Considerando la esperanza de vida 
            try {
                edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese edad de paciente"));
                paciente.setEdad(edad);
                if (edad < 0 || edad > 100) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese una edad valida");
                }
            } catch (NumberFormatException ex) {  // Por evitar errores de formato
                JOptionPane.showMessageDialog(null, "Por favor ingrese una edad valida");
            }
        }

        paciente.setEdad(edad);
    }

}
