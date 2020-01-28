/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naldana.clinica;

import com.naldana.clinica.controller.Gestionar;
import javax.swing.JOptionPane;

/**
 *
 * @author nexxtor <nestor.aldana1@gmail.com>
 */
public class SubMenu {

    private Gestionar gestionador; // El que gestiona la entidad de interes
    private String entidad;

    public SubMenu() {
    }

    public SubMenu(Gestionar gestionador, String entidad) {
        this.gestionador = gestionador;
        this.entidad = entidad;
    }

    /**
     * Muestra opciones de gestion y pide al usario la que desea elegir Si el
     * usario ingresa una cadena en lugar de un número se devolvera el valor de
     * O
     *
     * @return a int con la opcion seleccionada
     */
    public int selectedOptions() {
        String options = "Seleccione una opción (número).\n" // Opciones del menú principal
                + "1. Registrar " + entidad + "\n"
                + "2. Mostrar " + entidad + "\n"
                + "3. Modificar " + entidad + "\n"
                + "4. Eliminar " + entidad + "\n"
                + "5. Atras";

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
        int option; // Se alamacenara la opcion ingresada
        String identificador;
        do {
            option = selectedOptions(); // Mostrar y solicitar

            switch (option) {
                case 1: // Regisrar
                    if (gestionador.registrar()) {
                        JOptionPane.showMessageDialog(null, entidad + " ingresado con exito");
                    } else {
                        JOptionPane.showMessageDialog(null, entidad + " No se pudo ingresar, el valor de identificación ya existe");
                    }
                    break;
                case 2: // Mostrar
                    gestionador.mostrar();
                    break;
                case 3: // Modificar 
                    identificador = JOptionPane.showInputDialog("Ingrese el identificador de " + entidad + " que desea modificar");
                    if (gestionador.modificar(identificador)) {
                        JOptionPane.showMessageDialog(null, entidad + " Fue modificado con exito");
                    } else {
                        JOptionPane.showMessageDialog(null, "El " + entidad + " que desea modificar no existe");
                    }
                    break;
                case 4: // Eliminar
                    identificador = JOptionPane.showInputDialog("Ingrese el identificador de " + entidad + " que desa eliminar");
                    if (gestionador.eliminar(identificador)) {
                        JOptionPane.showMessageDialog(null, entidad + " Fue modificado con exito");
                    } else {
                        JOptionPane.showMessageDialog(null, "El " + entidad + " que desea eliminar no existe");
                    }
                    break;
                case 5: // Salir del menu
                    return;
                default: // Datos invalidos
                    JOptionPane.showMessageDialog(null, "Por favor ingrese una opción valida");
            }
        } while (option != 5);

    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public Gestionar getGestionador() {
        return gestionador;
    }

    public void setGestionador(Gestionar gestionador) {
        this.gestionador = gestionador;
    }

}
