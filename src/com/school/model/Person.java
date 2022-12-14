package com.school.model;

public class Person extends Model{
    private Role role;
    private int courseId;
    public String oneName, secondName;




    public Person(String name,Role role,int courseId) {
        super(name,++counter);
        this.role = role;

    }
    static private int counter = 0;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public static void setCounter(int counter) {
        Person.counter = counter;
    }

    public static int getCounter() {
        return counter;
    }
    public enum Role{STUDENT, TEACHER}


}

