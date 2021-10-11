package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% ineterest = " + calculateInterest(10000.0,2.0));

        for(int i = 9; i > 2; i--){
            System.out.println("10,000 at " + i  + "% " + " interest = " + String.format("%.2f",calculateInterest( 10000.0,i)));
        }
        int k = 0;
        System.out.println("The numbers are");
        for(int i = 0; i< 100; i++){
            if(isPrime(i)){
                System.out.println(i);
                k++;
                if(k==3){
                    break;
                }
            }
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return(amount*(interestRate/100));
    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
