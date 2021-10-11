package com.company;

public class Main {

    public static void main(String[] args) {

        double var1 = 20.00d;
        double var2 = 80.00d;
        double sum = (var1+var2)*100d;
        System.out.println("Sum of (var1 + var2) * 100 = " + sum);
        double remainder = sum % 40;
        System.out.println("The remainder= " + remainder);
        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println(isNoRemainder);
        if(!isNoRemainder)
        {
            System.out.println("got some remainder");
        }




    }
}
