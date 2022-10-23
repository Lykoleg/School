package com.school.Model;

public class Course {
    private int ID;
    //public String name;
    public Course() {
        counter++;
        this.ID = counter;
    }
    static private int counter = 0;
    public int getID() {
            return this.ID;
    }
    public static int getCounter() {
        return counter;
    }
}


