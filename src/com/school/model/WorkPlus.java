package com.school.model;

public class WorkPlus extends Model {

    public WorkPlus(String name) {
        super(name, ++counter);
    }

    static private int counter = 0;


    public static int getCounter() {
        return counter;
    }
    @Override
    public String toString() {

        return "WorkPlus name" + getName() + getID() + getCounter();
    }
}



