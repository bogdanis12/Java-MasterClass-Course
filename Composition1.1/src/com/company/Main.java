package com.company;

public class Main {

    public static void main(String[] args) {
	    Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220b","Dell","240V", dimensions);
        Monitor theMonitor = new Monitor("27inch Beast", "Asus", 27,new Resolution(2540,1440));
        Motherboard theMotherboard = new Motherboard("BJ200", "Asus", 4,6,"v2.44");

        PC thePC = new PC(theCase,theMonitor,theMotherboard);
//        thePC.getMonitor().drawPixelAt(4,5,"green");
//        thePC.getMotherboard().loadProgram("Windows 10");
//        thePC.getTheCase().pressPowerButton();
        thePC.powerUp();

    }
}
