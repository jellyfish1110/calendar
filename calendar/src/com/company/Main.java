package com.company;

public class Main {

    public static void main(String[] args)
    {
        Year year = new Year();
        Month january = new Month(1, 31);
        Month february = new Month();
        january.setMonth();
        february.setMonth();
        System.out.println(february.monthData());
    }
}
