package com.company;

public class Main {

    public static void main(String[] args) {
	    //byte
        //short
        //int - most use
        //long
        //float
        //double - most use
        //char
        //boolean - most use
        String myString = "This is a string";
        System.out.println("My string = " + myString);
        myString = myString + ", more text, I love it!";
        System.out.println("My string = " + myString);
        myString = myString + "\u00A9";
        System.out.println("My string = " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt=15;
        lastString = lastString + myInt;
        System.out.println("LastString = "+ lastString);
        double doubleNUmber = 120.47d;
        lastString = lastString + doubleNUmber;
        System.out.println("LastString = " + lastString);
    }
}
