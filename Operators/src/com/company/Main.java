package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1+2; // 1 + 2 = 3
        System.out.println("result = " + result);
        result = result - 1;
        System.out.println("newresult = " + result);
        result = result * 10;
        System.out.println("newresult2 = " + result);
        result = result / 10;
        System.out.println("newresult3 = " + result);
        result = result % 10;
        System.out.println("newresult4 = " + result);
        result++; //increment value by 1
        System.out.println("newresult5 = " + result);
        result--; //increment value by 1
        System.out.println("newresult6 = " + result);
        result += 2;
        System.out.println("newresult7 = " + result);
        result *= 10;
        System.out.println("newresult8 = " + result);
        result /= 3;
        System.out.println("newresult9 = " + result);
        result -= 2;
        System.out.println("newresult10 = " + result);
    }
}
