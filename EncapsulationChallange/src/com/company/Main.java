package com.company;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(5,false);
        System.out.println("initial page count= " +printer.getPagesPrinted());
        int pagesPrinted = printer.printingPage(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer is " + printer.getPagesPrinted());
        pagesPrinted = printer.printingPage(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer is " + printer.getPagesPrinted());



    }
}
