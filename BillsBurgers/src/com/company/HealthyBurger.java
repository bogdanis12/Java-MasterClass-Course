package com.company;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;
    public HealthyBurger(String name, String meat, double price, String breadRollType) {
        super("HealthyBurger", "bacon", 5.6, "brown rye roll");
    }

    public void addHealthyAdditon1(String healthyExtra1Name,double healthyExtra1Price){
        this.healthyExtra1Name=healthyExtra1Name;
        this.healthyExtra1Price=healthyExtra1Price;
    }
    public void addHealthyAddition2(String addition2Name,double addition2Price){
        this.healthyExtra2Name=healthyExtra2Name;
        this.healthyExtra2Price=healthyExtra2Price;
    }

    @Override
    public double itemizehamburger() {
        double hamburgerPrice = super.itemizehamburger();
        if(healthyExtra1Name!=null){
            hamburgerPrice = hamburgerPrice + healthyExtra1Price;
            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
        }
        if(healthyExtra2Name!=null){
            hamburgerPrice = hamburgerPrice + healthyExtra2Price;
            System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}

