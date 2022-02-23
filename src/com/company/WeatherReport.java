package com.company;

import java.util.Random;
import java.util.Scanner;

public class WeatherReport {

    public static void main(String[] args) {
	Day myDay = new Day();
    myDay.buildReport();
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Please provide day of the week for your Weather Report");
    String userInput = myScanner.nextLine();
    myDay.DailyReport(userInput);
    Random rand = new Random();
    int upperbound = 6;
    int number = rand.nextInt(upperbound);
   System.out.println("The weather report for " + userInput + " will be "
           +   myDay.buildFullReport.get(rand.nextInt(upperbound)));


    }
}
