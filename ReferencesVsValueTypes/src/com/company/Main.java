package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue= " + myIntValue);
        System.out.println("anotherIntValue= " +anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue= " + myIntValue);
        System.out.println("anotherIntValue= " +anotherIntValue);

        int[] myArray = new int[5];
        int[] anotherArray = myArray;

        System.out.println("myArray= " + Arrays.toString(myArray));
        System.out.println("anotherArray= " + Arrays.toString(anotherArray));

        anotherArray[0]= 1;
        System.out.println("after change myArray= " + Arrays.toString(myArray));
        System.out.println("after change anotherArray= " + Arrays.toString(anotherArray));
        anotherArray = new int[]{4,5,6,7,8};
        modifyArray(myArray);
        System.out.println("after modify myArray= " + Arrays.toString(myArray));
        System.out.println("after modify anotherArray= " + Arrays.toString(anotherArray));
    }


    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[]{1,2,3,4,5};

    }
}
