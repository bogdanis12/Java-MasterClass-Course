package com.company;

public class Vehicle {
   private String name;
   private String size;

   private int currentVelocity;
   private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void steer(int direction){
        this.currentDirection=this.currentDirection + direction;
        System.out.println("Vehicle.steer(): Steering at " +currentDirection + " degrees");
    }
    public void move(int velocity, int direction){
        currentVelocity=velocity;
        currentDirection=direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction" + currentDirection +" degrees");
    }
    public void stop(){
        this.currentDirection=0;
    }
}
