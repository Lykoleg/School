package com.school.Model;

public class Lecture {
    private int ID;
    public String name;
    public int courseID;

    public Lecture(String name, int courseID) {
        counter++;
        this.name = name;
        this.ID = counter;
        this.courseID = courseID;
    }

    static private int counter = 0;

    public static int getCounter() {
        return counter;
    }
}



