package com.naldana;

public class Computer {

    private double cpuSpeed;

    Computer() {
        cpuSpeed = 0;
    }

    void setCpuSpeed(double _cpuSeed) {
        cpuSpeed = _cpuSeed;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public static void whatIsIt() {
        System.out.println( "it is a PC");
    }
}
