package com.school.model;

public class Teacher extends Model{

    public Teacher(String name){

        super(name,++counter);
    }
    static private int counter = 0;
    public static int getCounter() {

        return counter;
    }
    @Override
    public String toString() {

        return "Teacher name" + getName() +  getID() + getCounter();
    }

}

