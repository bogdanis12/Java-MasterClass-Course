package com.company;

public class Honda extends Car{
    private int roadServiceMonths;

    public Honda(int roadServiceMOnths) {
        super("Honda", "2wd", 4, 4, 6, false);
        this.roadServiceMonths = roadServiceMOnths;
    }
    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity==0){
            stop();
        }else if(newVelocity>0 && newVelocity<=1){
            changeGear(1);
        }else if(newVelocity>10 && newVelocity<=20){
            changeGear(2);
        }else if(newVelocity>20 && newVelocity<=30){
            changeGear(3);
        }else{
            changeGear(4);
        }
    }
}
