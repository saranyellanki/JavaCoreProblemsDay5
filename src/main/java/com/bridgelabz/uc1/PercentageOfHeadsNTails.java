package com.bridgelabz.uc1;

import java.util.Scanner;

public class PercentageOfHeadsNTails {

    public static double flipCoin() {
        return Math.random();
    }

    public static void main(String[] args) {

        int totalDieRoll = 0;
        int headCount = 0;
        int tailCount = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of times to flip the coin : ");
        int userInput = input.nextInt();

        for (int i = 0; i < userInput ; i++ ) {
            double flipCoin = flipCoin();
            totalDieRoll++;

            if (flipCoin<0.5) {
                headCount++;
                System.out.println("Heads");
            }
            else if (flipCoin>0.5) {
                tailCount++;
                System.out.println("Tails");
            }
        }

        double headPercentage = ((double)headCount/(double)totalDieRoll)*100;
        System.out.println("Head Percentage : " + headPercentage);
        double tailPercentage = ((double)tailCount/(double)totalDieRoll)*100;
        System.out.println("Tail Percentage : " + tailPercentage);

    }
}