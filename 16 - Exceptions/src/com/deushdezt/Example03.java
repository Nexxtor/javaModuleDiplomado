package com.deushdezt;

public class Example03 {
    //Null pointer exception example
    public static void main(String[] args) {
        String text1 = null;
        String text2 = "null";

        if(text1 != null){
            System.out.println("This is a text");
        }else{
            System.out.println("This text is null");
        }

        if(text2.equals(text1)){
            System.out.println("They are the same text");
        }else{
            System.out.println("They are not the same");
        }

        if(text1.equals(text2)){
            System.out.println("They are the same text");
        }else{
            System.out.println("They are not the same");
        }


    }
}
