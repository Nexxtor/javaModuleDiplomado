package com.deushdezt.factory.factories;

import com.deushdezt.factory.enums.DogType;
import com.deushdezt.factory.models.Dog;
import com.deushdezt.factory.models.Poodle;
import com.deushdezt.factory.models.Rottweiler;
import com.deushdezt.factory.models.SiberianHusky;

public class DogFactory {

    public static Dog getDog(DogType type){
        switch (type){
            case BIG:
                return new SiberianHusky();
            case SMALL:
                return new Poodle();
            case BRAWNY:
                return new Rottweiler();
        }

        return new Dog() {
            @Override
            public void speak() {
                System.out.println("I'm an bugged dog");
            }
        };
    }
}
