package com.school.model;

public class Course {
    private int ID;
    private String name;

    public Course(String name) {
        counter++;
        this.ID = counter;
      this.name = name;
    }
    static private int counter = 0;
    public int getID() {
            return this.ID;
    }
    public static int getCounter() {
        return counter;
    }


    @Override
   public String toString(){
    return "Course name" +      name      + getCounter();
   }
}


