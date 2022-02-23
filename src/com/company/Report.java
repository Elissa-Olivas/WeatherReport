package com.company;

import java.util.List;

public class Report {
    public String dayOfWeek;
    public int temp;
    public String description;

    public Report(String dayOfWeek, int temp, String description) {
        this.dayOfWeek = dayOfWeek;
        this.temp = temp;
        this.description = description;

    }

    public String toString() {
        return " " + temp + " " + description;
    }

    //for (int s = 0; s < suit.size(); s++) {
//        for (int r = 0; r < rank.size(); r++) {
//            completeDeck.add(new Card(suit.get(s), rank.get(r), value.get(r)));
}

