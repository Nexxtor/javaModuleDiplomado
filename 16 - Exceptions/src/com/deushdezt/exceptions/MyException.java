package com.deushdezt.exceptions;

public class MyException extends Exception {

    public MyException(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return "Message: " + super.getMessage();
    }
}
