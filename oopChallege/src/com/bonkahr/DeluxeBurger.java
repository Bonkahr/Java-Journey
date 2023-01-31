package com.bonkahr;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(){
        super(14.54, "sausage & bacon" , "white", "Deluxe");
        super.addAddition1("Chips", 2.75);
        super.addAddition2("Drinks", 3.44);
    }

    @Override
    public void addAddition1(String name, double price) {
        System.out.println("cant add additional items to deluxe burger");
    }

    @Override
    public void addAddition2(String name, double price) {
        System.out.println("cant add additional items to deluxe burger");
    }

    @Override
    public void addAddition3(String name, double price) {
        System.out.println("cant add additional items to deluxe burger");
    }

    @Override
    public void addAddition4(String name, double price) {
        System.out.println("cant add additional items to deluxe burger");
    }
}