package com.school.Model;

public class Homework {
    public Homework() {
        counter++;
    }

    private Long ID;
    static private int counter = 0;

    public static int getCounter() {
        return counter;
    }
}