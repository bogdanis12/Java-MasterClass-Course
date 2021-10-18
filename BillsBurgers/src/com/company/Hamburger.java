package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void add1HamburegerAddition1(String addition1Name,double addition1Price){
        this.addition1Name=addition1Name;
        this.addition1Price=addition1Price;
    }
    public void add2HamburegerAddition2(String addition2Name,double addition2Price){
        this.addition2Name=addition2Name;
        this.addition2Price=addition2Price;
    }
    public void add3HamburegerAddition3(String addition3Name, double addition3Price){
        this.addition3Name=addition3Name;
        this.addition3Price=addition3Price;
    }
    public void add4HamburegerAddition4(String addition4Name, double addition4Price){
        this.addition4Name=addition4Name;
        this.addition4Price=addition4Price;
    }

    public double itemizehamburger(){
        double hamburgerPrice = this.price;
        if(addition1Name!=null){
            hamburgerPrice = hamburgerPrice + addition1Price;
            System.out.println("Added " + addition1Name + " for an extra cost " + addition1Price);
        }
        if(addition2Name!=null){
            hamburgerPrice = hamburgerPrice + addition2Price;
            System.out.println("Added " + addition2Name + " for an extra cost " + addition2Price);
        }
        if(addition3Name!=null){
            hamburgerPrice = hamburgerPrice + addition3Price;
            System.out.println("Added " + addition3Name + " for an extra cost " + addition3Price);
        }
        if(addition4Name!=null){
            hamburgerPrice = hamburgerPrice + addition4Price;
            System.out.println("Added " + addition4Name + " for an extra cost " + addition4Price);
        }
        return hamburgerPrice;
    }


}
