package com.company;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double basePrice;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String breadRollType, String meat, double basePrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public void addHamburgerAddition1(String addition1Name,double addition1Price){
        this.addition1Name=addition1Name;
        this.addition1Price=addition1Price;
    }
    public void addHamburgerAddition2(String addition2Name,double addition2Price){
        this.addition2Name=addition2Name;
        this.addition2Price=addition2Price;
    }
    public void addHamburgerAddition3(String addition3Name,double addition3Price){
        this.addition3Name=addition3Name;
        this.addition3Price=addition3Price;
    }
    public void addHamburgerAddition4(String addition4Name,double addition4Price){
        this.addition4Name=addition4Name;
        this.addition4Price=addition4Price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice=this.basePrice;
        System.out.println(this.name + " hamburger" + " on a " + this.breadRollType +
                " roll" + " price is " + this.basePrice);

        if(this.addition1Name!=null){
            hamburgerPrice = hamburgerPrice + this.addition1Price;
            System.out.println("Added" + this.addition1Name + " for an extra " + this.addition3Price );
        }
        if(this.addition2Name!=null){
            hamburgerPrice = hamburgerPrice + this.addition2Price;
            System.out.println("Added" + this.addition2Name + " for an extra " + this.addition2Price );
        }
        if(this.addition3Name!=null){
            hamburgerPrice = hamburgerPrice + this.addition3Price;
            System.out.println("Added" + this.addition3Name + " for an extra " + this.addition3Price );
        }
        if(this.addition4Name!=null){
            hamburgerPrice = hamburgerPrice + this.addition4Price;
            System.out.println("Added" + this.addition4Name + " for an extra " + this.addition4Price );
        }
        return hamburgerPrice;
    }
}
class HealtyBurger extends Hamburger{
    public HealtyBurger() {
        super("Healthy Burger","brown rye","beef",4.2);
    }
    private String healthyaddition1Name;
    private double healthyaddition1Price;
    private String healthyaddition2Name;
    private double healthyaddition2Price;


    public void addHealthyAddition1(String healthyaddition1Name,double healthyaddition1Price){
        this.healthyaddition1Name=healthyaddition1Name;
        this.healthyaddition1Price=healthyaddition1Price;
    }
    public void addHealthyAddition2(String healthyaddition2Name,double healthyaddition2Price){
        this.healthyaddition2Name=healthyaddition2Name;
        this.healthyaddition2Price=healthyaddition2Price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(healthyaddition1Name!=null){
            hamburgerPrice = hamburgerPrice + healthyaddition1Price;
            System.out.println("Added " + healthyaddition1Name + " for an extra " + healthyaddition1Price);
        }
        if(healthyaddition2Name!=null){
            hamburgerPrice = hamburgerPrice + healthyaddition2Price;
            System.out.println("Added " + healthyaddition2Name + " for an extra " + healthyaddition2Price);
        }
        return hamburgerPrice;
    }
}
class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe Burger", "White", "Sausage and bacon", 14);
        super.addHamburgerAddition1("Chips",2.2);
        super.addHamburgerAddition2("Drink",1.7);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Cannot add additional items to a deluxe buurger");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Cannot add additional items to a deluxe buurger");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Cannot add additional items to a deluxe buurger");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Cannot add additional items to a deluxe buurger");
    }
}