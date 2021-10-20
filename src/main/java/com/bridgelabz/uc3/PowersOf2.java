package com.bridgelabz.uc3;

import java.util.Scanner;

public class PowersOf2 {

    public static boolean isInputValid(int num) {
        return num>=0 && num<=31;
    }

    public static void powerOf2(int num){
        for(int i=0;i<=num;i++) {
            System.out.println("2 power "+ i +" is: " + Math.pow(2, i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter the value of N: ");
            int n = sc.nextInt();
            if(!isInputValid(n)) System.out.println("Entered number is invalid");
            else{
                powerOf2(n);
                break;
            }
        }


    }
}
