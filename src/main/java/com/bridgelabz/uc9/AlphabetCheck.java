package com.bridgelabz.uc9;

import java.util.Scanner;

public class AlphabetCheck {

    public static boolean isVowel(char alphabet) {

        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};

        for (char item : vowels) {
            if (alphabet == item) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet : ");
        char alphabet = sc.next().charAt(0);
        System.out.println(alphabet);

        if (isVowel(alphabet)){
            System.out.println( alphabet + " is a Vowel");
        }else
            System.out.println( alphabet + " is a Consonant");
   }
}
