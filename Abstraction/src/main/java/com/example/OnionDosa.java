package com.example;

public class OnionDosa extends Dosa{




    OnionDosa(){

        super.MainIngredient();
    }
    @Override
    void prepareDosa() {

        System.out.println("Add onions to dosa while preparing");

    }

    @Override
    float pay() {
        return 15.0f;
    }
}
