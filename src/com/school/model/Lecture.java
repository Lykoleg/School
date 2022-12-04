package com.school.model;

public class Lecture extends Model {


    public Lecture(String name) {
        super(name, ++counter);

    }

    static private int counter = 0;


    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Lecture name" + getName() + getID() + getCounter();
    }
}



