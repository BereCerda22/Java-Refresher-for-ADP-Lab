package com.simple;

import java.util.Scanner;


public class SimpleAdder {
    public static void main(String args[]) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        for(int x = 0; x < 10; x++) {
            System.out.println("Please enter integer #" + (x+1));
            int input = scan.nextInt();
            if (input < 0) {
                continue;
            }
            if(input == 0) {
                break;
            }

            sum += input;

//
        }
        System.out.println("The sum is " + sum);
        scan.close();



    }


}
