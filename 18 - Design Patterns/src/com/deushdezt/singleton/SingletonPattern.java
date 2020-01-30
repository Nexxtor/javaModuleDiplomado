package com.deushdezt.singleton;

public class SingletonPattern {
    public static void main(String[] args) {
        BaseMenu menu1 = new BaseMenu();
        BaseMenu menu2 = new BaseMenu();

        menu1.showMenu();
        menu2.showMenu();

        SingletonMenu menuS1 = SingletonMenu.getInstance();
        SingletonMenu menuS2 = SingletonMenu.getInstance();

        menuS1.showMenu();
        menuS2.showMenu();
    }
}
