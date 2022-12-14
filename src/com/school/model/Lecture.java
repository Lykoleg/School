package com.school.model;

public class Lecture extends Model {
    private int personId;
    private String description;


    public Lecture(String name,String description,int personId) {
        super(name, ++counter);
        this.description=description;
        this.personId=personId;

    }

    static private int counter = 0;

    @Override
    public String toString() {
        return "Lecture{" +
                ", name='" + getName() + '\'' +
                "personId=" + personId +
                ", description='" + description + '\'' +
                ", lectureId='" + getID() + '\'' +
                '}';
    }

    public String getDescription() {
        return getDescription();
    }
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public static void setCounter(int counter) {
        Lecture.counter = counter;
    }

    public static int getCounter() {
        return counter;
    }

}



