package org.example;
import java.util.Scanner;
import java.util.Calendar;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jorge Quiros
 */
public class Retirement
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);
        System.out.println( "Enter your age." );
        String currentAge= input.nextLine();
        System.out.println( "At what age would you like to retire." );
        String retirementAge= input.nextLine();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int ageNumber=Integer.parseInt(currentAge);
        int retirementNumber=Integer.parseInt(retirementAge);
        int yearsLeft= retirementNumber - ageNumber;
        int retirementYear = year + yearsLeft;

        System.out.println("You have "+ yearsLeft + " years left until you can retire.");
        System.out.println("It's " + year + ", so you can retire in " + retirementYear + ".");



    }
}
