package com.deushdezt.factory;

import com.deushdezt.factory.enums.DogType;
import com.deushdezt.factory.factories.DogFactory;
import com.deushdezt.factory.models.Dog;

public class FactoryPattern {
    public static void main(String[] args) {
        Dog[] dogs = {
                DogFactory.getDog(DogType.SMALL),
                DogFactory.getDog(DogType.BRAWNY),
                DogFactory.getDog(DogType.BIG),
        };

        for(Dog dog: dogs){
            dog.speak();
        }
    }
}
