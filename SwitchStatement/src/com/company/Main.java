package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

//	int value = 3;
//    if(value == 1){
//        System.out.println("Value was 1");
//    }else if ( value == 2){
//        System.out.println("Value was 2");
//    }else{
//        System.out.println("Was not 1 or 2");
//    }
//     int switchValue = 3;
//    switch (switchValue){
//        case 1:
//            System.out.println("Value was 1");
//            break;
//
//        case 2:
//            System.out.println("Value was 2");
//            break;
//
//        case 3: case 4: case5:
//            System.out.println("was 3, 4 ,5");
//            System.out.println("Actually it was a " + switchValue);
//            break;
//
//        default:
//            System.out.println("Was not 1 or 2");
//    }
    char switchValue2 = 'F';
    switch (switchValue2){
        case 'A': case 'B': case 'C': case 'D': case 'E':
            System.out.println("was A, B, C, D or E");
            System.out.println("The letter was " + switchValue2);
            break;
        default:
            System.out.println("The letter was not found");
            break;
    }

    String month = "january";
    switch (month.toLowerCase()){
        case "january":
            System.out.println("Jan");
            break;
        case "June":
            System.out.println("Jun");
            break;
        default:
            System.out.println("Not sure");
    }
    }
}
