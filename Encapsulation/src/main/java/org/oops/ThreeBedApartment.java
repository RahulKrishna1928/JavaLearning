package org.oops;

public class ThreeBedApartment implements Apartment {
    @Override
    public void noOfRooms() {
        System.out.print("Number of rooms are three");
    }

    @Override
    public void size() {
        System.out.print("Size is 1000 sft");
    }

    @Override
    public void cost() {
        System.out.print("Cost is 20 Lakhs");
    }
}
