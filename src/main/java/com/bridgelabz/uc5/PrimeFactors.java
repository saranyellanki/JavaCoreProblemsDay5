package com.bridgelabz.uc5;

import java.util.Scanner;

public class PrimeFactors {

    public static void primeFactors(int num) {
        for(int i = 2; i<= num; i++) {
            while(num%i == 0) {
                System.out.println(i);
                num = num/i;
            }
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int input = sc.nextInt();
        System.out.println("Prime factors are of " + input + " are : ");
        primeFactors(input);
    }
}
