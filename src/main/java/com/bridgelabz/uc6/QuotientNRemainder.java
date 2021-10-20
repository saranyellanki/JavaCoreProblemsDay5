package com.bridgelabz.uc6;

import java.util.Scanner;

public class  QuotientNRemainder {

    public static void quotient(int dividend, int divisor) {
        int ans = dividend/divisor;
        System.out.println("The quotient is : " + ans);
    }

    public static void remainder(int dividend, int divisor) {
        int ans = dividend%divisor;
        System.out.println("The remainder is : " + ans);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for Dividend : ");
        int dividend = sc.nextInt();
        System.out.print("Enter the number for Divisor : ");
        int divisor = sc.nextInt();
        quotient(dividend,divisor);
        remainder(dividend,divisor);

    }
}
