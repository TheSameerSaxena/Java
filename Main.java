package com.company;

public class Main {

    public static void main(String[] args) {

        getDurationString(65,45);
        getDurationString(3945);
    }

    public static void getDurationString(int minutes, int seconds){
        if(minutes >= 0 && seconds >= 0 && seconds <= 59){
            int h = minutes / 60;
            int m = minutes % 60;
            System.out.println(h + "h " + m + "m " + seconds + "s");
        }
    }

    public static void getDurationString(int seconds){
        if(seconds >= 0){
            int m = seconds / 60;
            int s = seconds % 60;
            getDurationString(m,s);
        }
    }
}
