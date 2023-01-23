package com.school.model;

public class HomeWork extends Model{

    public HomeWork(String name) {
        super(name,++counter);
    }
    static private int counter = 0;
    public static int getCounter() {
        return counter;
    }
    @Override
    public String toString() {
        return "Homework name" + getName() + getID() + getCounter();
    }
}

