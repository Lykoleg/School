package com.school.Model;

public class Homework {
    public String name;
    public Homework() {
        counter++;
        this.ID = counter;
    }

    private int ID;
    static private int counter = 0;

    public static int getCounter() {
        return counter;
    }
}

