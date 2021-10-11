package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }
    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || (seconds < 0 || seconds > 59 )){
            return "Invalid value";
        }
        else{
        long hours = (int)minutes/60;
        long remainingMinutes = (int)minutes % 60;
        return hours + "h " + remainingMinutes + "m "+ seconds + "s";}
    }
    public static String getDurationString(int seconds){
        if(seconds < 0){
            System.out.println("Invalid value");
        }
        int minutes = (int)seconds/60;
        int remainingSeconds = (int)seconds % 60;
        String x = getDurationString(minutes,remainingSeconds);
        return x;
    }
}
