package com.school.model;

public class Student extends Model {

    public Student(String name) {
        super(name,++counter);


    }
    static private int counter = 0;
    public static int getCounter() {
        return counter;
    }
    @Override
    public String toString() {
        return "Student name" + getName() + getID() + getCounter();
    }

}
