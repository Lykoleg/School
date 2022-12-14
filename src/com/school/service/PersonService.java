package com.school.service;


import com.school.model.*;

public class PersonService {
    public Person createNewStudent(String name,int courseId) {
        Person person = new Person(name,Person.Role.STUDENT,courseId);
        //System.out.println("Course counter " + Course.getCounter());
        //System.out.println("Student counter " + Person.getCounter());
        System.out.println("Student one name");
        System.out.println("Student second name");
        System.out.println("--------------------------------------");
        return person;
    }
    public Person createNewTeacher(String name,int courseId) {
        Person person = new Person(name, Person.Role.STUDENT,courseId);
        //System.out.println("Course counter " + Course.getCounter());
        //System.out.println("Student counter " + Person.getCounter());
        System.out.println("Student one name");
        System.out.println("Student second name");
        System.out.println("--------------------------------------");
        return person;
    }
}
