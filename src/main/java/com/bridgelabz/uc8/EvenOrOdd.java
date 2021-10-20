package com.bridgelabz.uc8;

import java.util.Scanner;

public class EvenOrOdd {

    public static void check(int n) {
        if(n%2==0) System.out.println("The number "+n+" is even");
        else System.out.println("The number "+n+" is odd");
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        check(num);
    }
}
