package com.deushdezt.arrays;

import java.util.Arrays;

public class ReturnExample {
    public static void main(String[] args) {
        String[] words = getWords("Esta es una frase con muchas palabras");

        for(String word : words){
            System.out.println(word);
        }
    }

    public static String[] getWords(String phrase) {
        String whitespace = " ";

        if (!(phrase == null || phrase.isEmpty())) {
            return phrase.split(whitespace);
        } else return new String[0];
    }
}
