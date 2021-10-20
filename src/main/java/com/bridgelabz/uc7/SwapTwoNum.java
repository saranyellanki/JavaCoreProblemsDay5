package com.bridgelabz.uc7;

import java.util.Scanner;

public class SwapTwoNum {

    public static void beforeSwap(int a, int b) {
        System.out.println("Numbers before Swapping : " +a+ "" +b);
    }

    public static void afterSwap(int a, int b) {
        int change;
        change = a;
        a = b;
        b = change;
        System.out.println("Numbers after Swapping : " +a+ "" +b);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        beforeSwap(a,b);
        afterSwap(a,b);
    }
}
