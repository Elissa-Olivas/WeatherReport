package com.company;

public class Report {
    public String dayOfWeek;
    public int temp;
    public String description;

    public Report(String dayOfWeek, int temp, String description) {
        this.dayOfWeek = dayOfWeek;
        this.temp = temp;
        this.description = description;

    }
    public String getDayOfWeek() {
        return dayOfWeek;
    }
    public int getTemp(){
        return temp;
    }
    public String getDescription(){
        return description;
    }


    public String toString() {
        return " " + temp + " " + description;
    }
}

