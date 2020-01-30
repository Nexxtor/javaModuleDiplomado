package com.deushdezt.strategy.contexts;


import com.deushdezt.strategy.models.Person;
import com.deushdezt.strategy.strategies.CLIStrategy;
import com.deushdezt.strategy.strategies.GUIStrategy;
import com.deushdezt.strategy.strategies.InputStrategy;

public class InputStrategyContext {
    private InputStrategy strategy;

    public InputStrategyContext(String type) {
        if(type != null && type.equals("GUI")){
            strategy = new GUIStrategy();
        }else {
            strategy = new CLIStrategy();
        }
    }

    public Person getNewPerson(){
        return strategy.getPerson();
    }
}
