package com.deushdezt.singleton;

public class BaseMenu{
    public void showMenu(){
        String msg = "Showing menu from " + this + ":\n" +
                "1. Add resource\n" +
                "2. Alter resource\n" +
                "3. Delete resource\n" +
                "4. Exit\n";
        System.out.println(msg);
    }
}
