package com.company;

public class Main {

    public static void main(String[] args) {
        // int count = 6;
//        while(count !=6 ){
//            System.out.println("Count value is: " + count);
//            count++;
//        }

//        count = 1;
//        while(true){
//            if(count ==6){
//                break;
//            }
//            System.out.println("Count value is: " + count);
//            count++;
//        }
//        count = 6;
//        do{
//            System.out.println("Count value was: " + count);
//            count++;
//            if(count>100){
//                break;
//            }
//        }while(count!=6);
        int n = 4;
        int k = 0;
        int finishNumber = 20;
        while(n <= finishNumber){
            n++;
            if(!isEvenNumber(n)){
                continue;
            }
            k++;
            if(k==5){
                break;
            }
        }
        System.out.println("Even number total: " + k);

    }
    public static boolean isEvenNumber(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }
}
