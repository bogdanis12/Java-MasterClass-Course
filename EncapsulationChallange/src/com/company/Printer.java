package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if(tonerLevel>-1 && tonerLevel<=100){
            this.tonerLevel=tonerLevel;
        }
        else{
            this.tonerLevel=-1;
        }
        this.duplexPrinter = duplexPrinter;
    }



    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount<=10){
            if(this.tonerLevel + tonerAmount > 100){
                return -1;}
            this.tonerLevel+=tonerAmount;
            return this.tonerLevel;
        }
        else{
            return -1;
        }
    }

    public int printingPage(int pages){
        int pagesToPrint = pages;
        if(this.duplexPrinter){
            pagesToPrint = pagesToPrint/2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted= this.pagesPrinted+pagesToPrint;
        return pagesToPrint;
    }

    public void isDuplexPrinter(){
        if(this.duplexPrinter==true){
            System.out.println("duplex");
        }
        else{
            System.out.println("non-duplex");
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
