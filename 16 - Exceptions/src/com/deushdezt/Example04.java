package com.deushdezt;

public class Example04 {
    public static void main(String[] args) {
        String text = null;
        //String text = "Texto 1";

        try {
            System.out.println(text.length());
        } catch (Exception e) {
            System.out.println("Ocurrió un error de puntero nulo");
        }
    }
}
