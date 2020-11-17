package com.company;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class Year {

    private int yearSize = 12;
    private ArrayList<Month> year = new ArrayList<Month>(yearSize);

    public Year() {
        this.year = year;
    }

    public int getYearSize() {
        return yearSize;
    }

    public void setYear() {

        for (Month currentMonth : year)
        {
            int consecutive = currentMonth.getMonthNumber();
            year.add(consecutive, currentMonth);
        }
    }
}
