package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        int sum = 0;
        while (i != 6){
            System.out.println("Enter " + i + " Number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                sum += scanner.nextInt();
                i++;
            }else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("Total is: " + sum);
        scanner.close();
    }
}

