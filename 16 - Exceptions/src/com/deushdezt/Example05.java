package com.deushdezt;

public class Example05 {
    public static void main(String[] args) {
        String[] strings = new String[] {"Text1", "Text2"};

        try {
            strings[2] = "Text3";
        } catch (Exception e) {
            System.out.println("Ocurrió un error al tratar de acceder a espacio de arreglo que no existe");
        }
    }
}
