package com.deushdezt;

import com.deushdezt.exceptions.MyException;

public class Example06 {
    public static void main(String[] args) {
        String message = null;
        //message = "Test message!";
        int count = -1;

        try {
            count = getCharCount(message);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            if (count < 0){
                count = 0;
            }

            System.out.println("Count: " + count);
        }
    }

    public static int getCharCount(String message) throws MyException {
        if (message != null) {
            return message.length();
        } else {
            throw new MyException("The string is null");
        }
    }
}
