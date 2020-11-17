package com.company;

import java.util.ArrayList;

public class Month {

    String[] Name = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    String[] Dates = {"st", "nd", "rd", "th"};

    private int monthNumber;
    private int size;
    private ArrayList<Day> month = new ArrayList<>(size);
    private String monthName;

    //constructor for february
    public Month()
    {
        this.monthNumber = 2;
        this.size = 28;
        this.month = month;
        this.monthName = Name[1];
    }

    //constructor for the month class, which takes in parameters for the name of the month and its size
    public Month(int monthNumber, int size)
    {
        this.monthNumber = monthNumber;
        this.size = size;
        this.month = month;
        this.monthName = Name[monthNumber - 1];
    }

    //method adding all the day objects into the list in order
    public void setMonth()
    {
        int dateNumber = 1;

        while(size > 0)
        {
            Day day = new Day(dateNumber);
            month.add(day);
            size--;
            dateNumber++;
        }
    }

    public String getMonthName()
    {
        return monthName;
    }

    public int getMonthSize()
    {
        return size;
    }

    public int getMonthNumber()
    {
        return monthNumber;
    }

    public Day dayInfo(int dayOfMonth)
    {
        return month.get(dayOfMonth);
    }

//    public String dailyTasks()
//    {
//        StringBuilder stringBuilder = new StringBuilder();
//
//        stringBuilder.append("");
//
//        return stringBuilder.toString();
//    }

    public String monthData()
    {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Month " + "[" + getMonthName() + "]" + "\n\n");
        int index = 1;

        for(Day currentDay : month)
        {
            if(index == 1)
            {

                stringBuilder.append(currentDay.getDate() + Dates[0] + " of " + getMonthName() + ": " + "\n");

                if (currentDay.getTasks().size() > 0)
                {
                    stringBuilder.append(currentDay.getTasks() + "\n");
                }

                else
                {
                    stringBuilder.append("List is empty, no tasks due this date. " + "\n");
                }
            }

            else if(index == 2)
            {
                stringBuilder.append(currentDay.getDate() + Dates[1] + " of " + getMonthName() + ": " + "\n");

                if (currentDay.getTasks().size() > 0)
                {
                    stringBuilder.append(currentDay.getTasks() + "\n");
                }

                else
                {
                    stringBuilder.append("List is empty, no tasks due this date. " + "\n");
                }
            }

            else if(index == 3)
            {
                stringBuilder.append(currentDay.getDate() + Dates[2] + " of " + getMonthName() + ": " + "\n");

                if(currentDay.getTasks().size() > 0)
                {
                stringBuilder.append(currentDay.getTasks() + "\n");
                }

                else
                {
                    stringBuilder.append("List is empty, no tasks due this date. " + "\n");
                }
            }

            else if(index > 3)
            {
                stringBuilder.append(currentDay.getDate() + Dates[3] + " of " + getMonthName() + ": " + "\n");

                if(currentDay.getTasks().size() > 0)
                {
                    stringBuilder.append(currentDay.getTasks() + "\n");
                }

                else
                {
                    stringBuilder.append("List is empty, no tasks due this date. " + "\n");
                }
            }index++;
        }return stringBuilder.toString();
    }
}
