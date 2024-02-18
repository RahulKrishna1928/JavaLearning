package org.oops;

public class TwoBedApartment implements Apartment{


    @Override
    public void noOfRooms() {
        System.out.print("Number of rooms are two");
    }

    @Override
    public void size() {
        System.out.print("Size is 500 sft");
    }

    @Override
    public void cost() {
        System.out.print("Cost is 10 Lakhs");
    }
}
