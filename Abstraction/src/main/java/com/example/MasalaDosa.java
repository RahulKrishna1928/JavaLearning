package com.example;

public class MasalaDosa extends Dosa{

    static MasalaDosa getDosa()
    {
         MasalaDosa d= new MasalaDosa();
         d.prepareDosa();
         return d;

    }
   private MasalaDosa(){

        super.MainIngredient();
    }
    @Override
    void prepareDosa() {
        System.out.println("Add aloo masala to dosa while preparing");

    }

    @Override
    float pay() {
        return 10.0f;
    }
}
