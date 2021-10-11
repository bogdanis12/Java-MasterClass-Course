package com.company;

public class Main {

    public static void main(String[] args) {

         int sum = 0;
         int k = 0 ;
        System.out.println("The numbers are: ");
         for(int i = 0 ; i< 1000; i++){
             if(i % 3 == 0 && i%5==0){
                 k++;
                 sum +=i;
                 System.out.print(i + ",");
                 if(k == 5)
                     break;
             }
         }
        System.out.println();
         System.out.println("The sum of the numbers is: " + sum);


    }

}
