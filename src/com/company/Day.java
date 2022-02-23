package com.company;

import java.util.ArrayList;
import java.util.List;

public class Day {

    public List<Report> buildFullReport = new ArrayList<>();

    public void buildReport() {
        String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] temp = {10, 30, 50, 70, 80, 90};
        String[] description = {"Snowy", "Cold", "Overcast", "Rainy", "Sunny", "Hot"};

        for (int i = 0; i < dayOfWeek.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                buildFullReport.add(new Report(dayOfWeek[i], temp[j], description[j]));
            }
        }
    }
    public void DailyReport(String userInputDay) {
        String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] temp = {10, 30, 50, 70, 80, 90};
        String[] description = {"Snowy", "Cold", "Overcast", "Rainy", "Sunny", "Hot"};

        for (int i = 0; i < temp.length; i++) {

                buildFullReport.add(new Report(userInputDay, temp[i], description[i]));
            }
        }


    public void printReport() {
        for (int n = 0; n < buildFullReport.size(); n++) {
            Report myReport = buildFullReport.get(n);
            String dayOfWeek = myReport.getDayOfWeek();
            int temp = myReport.getTemp();
            String description = myReport.getDescription();
            System.out.println(dayOfWeek + " " + temp + " " + description);
        }
    }
}




