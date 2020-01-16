package com.naldana;


public class Tablet extends Computer {
    private  double screenSize; // in inches

    void setScreenSize(double  _screenSize) {
        screenSize = _screenSize;
    }

    double getScreenSize() {
        return screenSize;
    }

    public static void whatIsIt() {
        System.out.println( "it is a Tablet");
    }
}
