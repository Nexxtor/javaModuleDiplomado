/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naldana.clinica.controller;

/**
 * Asegura que existan los métodos necesario en las tres entidades que guardan
 * los pacientes médicos y el historial clinico
 *
 * @author nexxtor <nestor.aldana1@gmail.com>
 */
public interface Gestionar {
    /**
     * Permite añadir un elemento a la colección
     * @return true si se puede agregar en otro caso false 
     */
    public abstract boolean registrar();

    /**
     * Muestra en pantalla en formato de texto 
     * todos los elementos de la coleccion
     */
    public abstract void mostrar();

    /**
     * Modifica un elemento de la colleccion leyendo datos desde el teclado
     * no modifica el valor clave
     * @param id Valor clave con el que se buscara el elemento
     * @return true si se puede modificar, false cualquier otro caso
     */
    public abstract boolean modificar(String id);

    /**
     * Elimina un elemnto de la coleccion buscadolo por su valor clave
     * @param id
     * @return 
     */
    public abstract boolean eliminar(String id);
}
