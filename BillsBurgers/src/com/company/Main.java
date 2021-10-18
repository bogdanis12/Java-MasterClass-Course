package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.add1HamburegerAddition1("Tomato", 0.27);
        hamburger.add2HamburegerAddition2("Lettuce", 0.75);
        hamburger.add3HamburegerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizehamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Healthy Burger","Bacon",5,"ryed brown roll");
        healthyBurger.add1HamburegerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAdditon1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizehamburger());

        DeluxeBurger db = new DeluxeBurger("Deluxe Burger","Sausage & Bacon", 14,"White");
        db.add3HamburegerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizehamburger());
    }
}
