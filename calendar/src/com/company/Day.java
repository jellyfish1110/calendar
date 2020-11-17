package com.company;

import java.util.ArrayList;

public class Day {

    private int date;
    private String name;
    ArrayList<String> toDo = new ArrayList<>();

    public Day(int date) {
        this.date = date;
        this.toDo = toDo;
    }

    public int getDate() {
        return date;
    }

    public ArrayList getTasks()
    {
        return toDo;
    }

    public void addTask(String newTask) {
        toDo.add(newTask);
    }

    public void removeTask(String redundantTask) {
        int size = toDo.size();

        for (String currentTask : toDo)
            switch (redundantTask) {

            }
    }

    public String tasksForTheDay() {
        StringBuilder stringBuilder = new StringBuilder();

        for (String currentTask : toDo)
        {
            int index = 1;
            stringBuilder.append("Task " + index + " : " + currentTask);
            index--;
        }

        return stringBuilder.toString();
    }
}