package com.bridgelabz.uc10;

import java.util.Scanner;

public class LargestNum {

    public static void largestOfThreeNumbers(int largestNumber, int num1, int num2, int num3){
        if (num1 > largestNumber) largestNumber = num1;
        if (num2 > largestNumber) largestNumber = num2;
        if (num3 > largestNumber) largestNumber = num3;
        System.out.println("The largest number among the three numbers is : " +largestNumber);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number : ");
        int num3 = sc.nextInt();
        largestOfThreeNumbers(0,num1,num2,num3);
    }
}
