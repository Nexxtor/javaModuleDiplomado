package com.naldana.clinica;

import com.naldana.clinica.controller.HistorialesClinicos;
import com.naldana.clinica.controller.Medicos;
import com.naldana.clinica.controller.Pacientes;
import javax.swing.JOptionPane;


/**
 * Muestra los contenidos de los menú de la aplicacion.
 *
 * @author nexxtor <nestor.aldana1@gmail.com>
 */
public class Menu {

    // Para una instancia única de menú
    private static Menu instance;

    // Asegura que solo la clase pueda usar el constructor
    private Menu() {
    }

    /**
     * Instancia de menú
     *
     * @return instance de menú
     */
    public static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }

    /**
     * Muestra opciones princiales y pide al usario la que desea elegir Si el
     * usario ingresa una cadena en lugar de un número se devolvera el valor de
     * O
     *
     * @return a int con la opcion seleccionada
     */
    public int selectedOptions() {
        String options = "Seleccione una opción (número).\n" // Opciones del menú principal
                + "1. Gestionar Pacientes.\n"
                + "2. Gestionar Médicos.\n"
                + "3. Gestionar Historial Clínico.\n"
                + "4. Salir";

        try { // Intentamos obtener un número 
            return Integer.parseInt(JOptionPane.showInputDialog(options));
        } catch (NumberFormatException e) {
            return 0; // indica que no se ingreso opcion valida (número)
        }
    }

    /**
     * Menú principal, que permite Gestionar todas las entidades
     */
    public void show() {
        // "BASE" de entidades 
        Pacientes pacientes = new Pacientes();
        Medicos medicos = new Medicos();        
        HistorialesClinicos historiales = new HistorialesClinicos(pacientes, medicos);
       
        // Sub menú, par mostras las opciones de gestion
        SubMenu subMenu = new SubMenu();

        int option; // Se alamacenara la opcion ingresada

        do {
            option = selectedOptions(); // Mostrar y solicitar

            switch (option) {
                case 1: // Gestionar Pacientes
                    subMenu.setEntidad("Paciente"); // Para mostrar
                    subMenu.setGestionador(pacientes); // Para administrar
                    subMenu.show(); //Mostrar
                    break;
                case 2: // Gestionar Medicos
                    subMenu.setEntidad("Medico");
                    subMenu.setGestionador(medicos);
                    subMenu.show();
                    break;
                case 3: // Gestionar Historial Clínico
                    subMenu.setEntidad("Historial Clinico");
                    subMenu.setGestionador(historiales);
                    subMenu.show();
                    break;
                case 4: // No es necesario, deberia solo salir, pero ...
                    JOptionPane.showMessageDialog(null, "¡Adios!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Por favor ingrese una opción valida");
            }
        } while (option != 4);

    }

}
