package com.company;

public class Main {

    public static void main(String[] args) {

        int flag = 0;
        int sum = 0;
        for(int i = 1; i < 1001; i++){
            if( (i % 3 == 0) && (i % 5 == 0) && (flag < 5)){
                System.out.println(i);
                sum += i;
                flag += 1;
            }
        }
        System.out.println("Sum of all the Numbers is: " + sum);
    }
}
