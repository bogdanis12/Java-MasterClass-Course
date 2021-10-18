package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","White","Sausage", 3.56);
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato",0.27);
        hamburger.addHamburgerAddition2("Lettuce",0.75);
        hamburger.addHamburgerAddition3("Cheese",1.13);
        System.out.println("Total burger price is: " + hamburger.itemizeHamburger());

        HealtyBurger healtyBurger = new HealtyBurger();
        healtyBurger.addHealthyAddition1("Bacon",1.2);
        healtyBurger.addHamburgerAddition2("egg", 2);
        System.out.println("Total burger price is: " + healtyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();
        db.addHamburgerAddition3("3",3.2);

}}
