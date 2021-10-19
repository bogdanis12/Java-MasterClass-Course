package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the length of the array: ");
        int count = scanner.nextInt();
        int[] myArray = readIntegers(count);
        reverse(myArray);
    }

    private static int[] readIntegers(int count){
        int[] array = new int[count];
        for(int i = 0; i< array.length;i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }

    private static void reverse(int[] array){
        System.out.println("The reverse array is: ");
        int maxIndex = array.length-1;
        int halfIndex = array.length/2;
        for(int i =0; i<halfIndex;i++){
            int aux = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = aux;
        }
        System.out.println(Arrays.toString(array));
    }
}
