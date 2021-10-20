package com.bridgelabz.uc2;

import java.util.Scanner;

public class LeapYear {

    public int year;
    public LeapYear(int year){
         this.year = year;
    }

    public boolean isValidYear() {
        return String.valueOf(year).length()==4;
    }

    public boolean isLeapYear(){
        return (Math.floorMod(year,4)==0 && Math.floorMod(year,100)!=0) || (Math.floorMod(year,400)==0);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter a year which is of four digit : ");
            LeapYear leapYear = new LeapYear(sc.nextInt());
            if(!leapYear.isValidYear()){
                System.out.println("Year entered is invalid");
            }
            else{
                if(leapYear.isLeapYear()) System.out.println("Year entered is a leap year");
                else System.out.println("Year entered is not a leap year");
                break;
            }
        }
    }

}
