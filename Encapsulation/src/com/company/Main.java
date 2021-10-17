package com.company;

public class Main {

    public static void main(String[] args) {
//	    Player player = new Player();
//        player.fullName = "Bogdan";
//        player.health = 20;
//        player.weapon="sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health=200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhacedPlayer player = new EnhacedPlayer("Bogdan", 200, "sword");
        System.out.println("Initial health is: " + player.getHealth());
        player.loseHealth(30);
        System.out.println("The remainig health is: " + player.getHealth());

    }
}
