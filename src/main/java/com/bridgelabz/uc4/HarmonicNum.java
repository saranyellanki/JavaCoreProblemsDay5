package com.bridgelabz.uc4;

import java.util.Scanner;

public class HarmonicNum {

    public static boolean isInputValid(int num) {
        return num!=0;
    }

    public static void nthHarmonicDigit(int num) {
        double harmonicNum = 0;
        for (int i = 1; i <= num ; i++) {
            harmonicNum += (double) 1 / i;
            System.out.println( i + "Harmonic Number is 1/" + i + " = " + harmonicNum);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the value of N : ");
            int n = sc.nextInt();
            if(!isInputValid(n)) System.out.println("Enter a number which is greater than zero");
            else {
                nthHarmonicDigit(n);
                break;
            }
        }
    }
}
