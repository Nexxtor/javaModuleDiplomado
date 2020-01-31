package com.deushdezt.singleton;

public class SingletonMenu extends BaseMenu {
    private static SingletonMenu INSTANCE;

    /**
     * We make the constructor private to be sure that nobody else use it
     */
    private SingletonMenu(){

    }

    /**
     * This method guaranty that it only exist one instance of menu
     * @return Instance of menu
     */
    public synchronized static SingletonMenu getInstance(){
        if (INSTANCE == null){
            INSTANCE = new SingletonMenu();
        }
        return INSTANCE;
    }
}
