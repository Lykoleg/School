package com.school.model;

public class Course extends Model {

    public Course(String name) {
        super(name, ++counter);//передає ім'я та ID в Model
    }

    static private int counter = 0;

    public static int getCounter() {
        return counter;
    }


    @Override
    public String toString() {
        return "Course{" +
                ", name='" + getName() + '\'' +
                ", courseId='" + getID() + '\'' +
                '}';
    }
}


