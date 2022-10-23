package com.school.Model;

public class Student {
    private int ID;
    public String name;
    public Student()
    {counter++;
        this.ID=counter;
    }
    static private int counter = 0;
    public static int getCounter() {
        return counter;
    }

}
