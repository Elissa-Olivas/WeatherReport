package com.company;

import java.util.Random;
import java.util.Scanner;

public class WeatherReport {

    public static void main(String[] args) {
        Day myDay = new Day();
        myDay.buildReport();
        Scanner myScanner = new Scanner(System.in);
        boolean playOn = false;
        do {
            System.out.println("Please provide day of the week for your Weather Report");
            String userInputDay = myScanner.nextLine();
            myDay.dailyReport(userInputDay);
            Random rand = new Random();
            int upperbound = 6;
            int number = rand.nextInt(upperbound);


//            if ((userInputDay == "Sunday") || (userInputDay == "Monday") || (userInputDay == "Tuesday")
//                    || (userInputDay == "Wednesday") || (userInputDay == "Thursday") || (userInputDay == "Friday")
//                    || (userInputDay == "Saturday")) {
            //            System.out.println("The weather report for " + userInputDay + " will be "
            //                    + myDay.buildFullReport.get(rand.nextInt(upperbound)));
//            } else {
//            System.out.println("That is an invalid option, please enter a day of the week.");
//
                System.out.println("The weather report for " + userInputDay + " will be "
                        + myDay.buildFullReport.get(rand.nextInt(upperbound)));
//            }
            System.out.println("Do you want another Weather Report? Please type 1 for yes and type 2 for no");
            int newInput = myScanner.nextInt();

            if (newInput == 1) {
                playOn = true;

            } else if (newInput == 2) {
                playOn = false;
            System.out.println("Have a good day!");
            }
        } while (playOn);
    }
}




