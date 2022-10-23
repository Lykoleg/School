package com.school.Model;

public class Lecture {
    private int ID;
    public String name;

    public Lecture() {
        counter++;
        this.ID = counter;
    }

    static private int counter = 0;

    public static int getCounter() {
        return counter;
    }
}



