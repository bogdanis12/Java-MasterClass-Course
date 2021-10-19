package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the numbers to be read: ");
        int count = scanner.nextInt();
        int[] myArray = readIntegers(count);
        System.out.println("min= "+ findMin(myArray));

    }
    public static int[] readIntegers(int count){
        int[] array = new int[count];
        for(int i = 0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }
    public static int findMin(int[] array){
        int min = array[0];
        for(int i =0;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }

}




