package com.deushdezt;

public class Exercise02 {
    //Annotations

    public static void main(String[] args) {
        Computer pc = new Computer();
        Tablet tablet = new Tablet();

        pc.whatIsIt();
        pc.describeIt();
        tablet.whatIsIt();
        tablet.describeIt();
    }
}

class Computer{
    @Deprecated
    public void whatIsIt(){
        System.out.println("I'm a PC");
    }

    public void describeIt(){
        System.out.println("I'm a new PC");
    }
}

@SuppressWarnings("deprecated")
class Tablet extends Computer{
    @Override
    public void whatIsIt() {
        System.out.println("I'm a Tablet");
    }

    @Override
    public void describeIt() {
        System.out.println("I'm a new Tablet");
    }
}
