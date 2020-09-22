package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secNumber){

        double num1 = firstNumber * 1000;
        double num2 = secNumber * 1000;
        return (int) (num1) == (int) (num2);
    }
}
