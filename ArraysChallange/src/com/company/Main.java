package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	    int[] myArray = getIntegers(5);
        printArray(myArray);
        sortedArray(myArray);
        int[] orderArray = Arrays.copyOf(myArray,myArray.length);
        System.out.println();
        printArray(orderArray);


    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for(int i=0;i<values.length;i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array){

        for(int i =0;i<array.length;i++){
            System.out.println("Element "+ i + ", typed value was: " + array[i]);
        }
    }

    public static int[] sortedArray(int[] array){
        int aux = 0;
        for(int i=0;i<array.length-1;i++){
            for(int j = 0; j<array.length-i-1;j++){
                if(array[j]<array[j+1]){
                    aux = array[j];
                    array[j]=array[j+1];
                    array[j+1]= aux;
                }
            }
        }
        return array;
    }
}
