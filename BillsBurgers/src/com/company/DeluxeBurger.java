package com.company;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger(String name, String meat, double price, String breadRollType) {
        super("Deluxe Burger", "Sausage & Bacon", 14, "White");
        super.add1HamburegerAddition1("Chips",2.2);
        super.add2HamburegerAddition2("Drinks",3.3);
    }
    public void add1HamburegerAddition1(String addition1Name,double addition1Price){
        System.out.println("Cannor add extra topping on a deluxe burger");
    }
    public void add2HamburegerAddition2(String addition2Name,double addition2Price){
        System.out.println("Cannor add extra topping on a deluxe burger");
    }
    public void add3HamburegerAddition3(String addition3Name, double addition3Price){
        System.out.println("Cannor add extra topping on a deluxe burger");
    }
    public void add4HamburegerAddition4(String addition4Name, double addition4Price){
        System.out.println("Cannor add extra topping on a deluxe burger");
    }

    @Override
    public double itemizehamburger() {
        return super.itemizehamburger();
    }
}
