package com.naldana;


public class Tablet extends Computer {
    private  double screenSize; // in inches

    void setScreenSize(double  _screenSize) {
        screenSize = _screenSize;
    }

    double getScreenSize() {
        return screenSize;
    }
}
