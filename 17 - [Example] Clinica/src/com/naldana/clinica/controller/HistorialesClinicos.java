/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naldana.clinica.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.naldana.clinica.model.HistorialClinico;
import com.naldana.clinica.model.Medico;
import com.naldana.clinica.model.Paciente;

/**
 *
 * @author nexxtor <nestor.aldana1@gmail.com>
 */
public class HistorialesClinicos implements Gestionar {

    private final ArrayList<HistorialClinico> historiales;
    // Para crear historial clinico solamento con datos existentes
    private final Pacientes pacientes;
    private final Medicos medicos;

    public HistorialesClinicos(Pacientes pacientes, Medicos medicos) {
        this.historiales = new ArrayList<>();
        this.pacientes = pacientes;
        this.medicos = medicos;
    }

    @Override
    public boolean registrar() {
        HistorialClinico historial = new HistorialClinico();
        obtenerDatosTeclado(historial, true);
        if (!historiales.contains(historial)) {
            historiales.add(historial);
            return true;
        }

        return false;
    }

    @Override
    public void mostrar() {
        if (historiales.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Nada que mostrar");
        } else {
            String datosHistoriales = "";
            for (HistorialClinico historial : historiales) {
                datosHistoriales += historial.toString() + "\n";
            }

            JOptionPane.showMessageDialog(null, datosHistoriales);
        }
    }

    @Override
    public boolean modificar(String id) {
        HistorialClinico historial = new HistorialClinico();
        historial.setCodigo(id);
        int index = historiales.indexOf(historial);
        if (index >= 0) {
            obtenerDatosTeclado(historiales.get(0), false);
            return true;
        }

        return false;
    }

    @Override
    public boolean eliminar(String id) {
        HistorialClinico historial = new HistorialClinico();
        historial.setCodigo(id);

        return historiales.remove(historial);
    }

    private void obtenerDatosTeclado(HistorialClinico historial, boolean nuevo) {

        if (nuevo) {
            historial.setCodigo(JOptionPane.showInputDialog(null, "Ingrese el código de historial clinico"));
        }

        boolean valido = true;
        do {
            historial.setIdMedico(JOptionPane.showInputDialog(null, "Ingrese la identificacion del medico acargo"));
            // Chequeo del ID del medico
            Medico medico = new Medico();
            medico.setIdentificacion(historial.getIdMedico());

            if (!medicos.containts(medico)) {
                JOptionPane.showMessageDialog(null, "Por favor asigne un medico existente");
                valido = false;
            }
        } while (!valido);

        valido = true;

        do {
            historial.setIdPaciente(JOptionPane.showInputDialog(null, "Ingrese la identificacion del paciente"));
            // Chequeo del ID del medico
            Paciente paciente = new Paciente();
            paciente.setIdentificacion(historial.getIdMedico());

            if (!pacientes.containts(paciente)) {
                JOptionPane.showMessageDialog(null, "Por favor asigne un paciente existente");
                valido = false;
            }
        } while (!valido);

        historial.setFecha(JOptionPane.showInputDialog(null, "Ingrese fecha de consulta"));

        historial.setObservaciones(JOptionPane.showInputDialog(null, "Ingrese observaciones de consulta"));
    }

}
