package com.school.service;


import com.school.model.*;

public class StudentService {
    public Student createNewStudent(String name) {
        Student student = new Student();
        System.out.println("Course counter " + Course.getCounter());
        System.out.println("Student counter " + Student.getCounter());
        System.out.println("Student one name");
        System.out.println("Student second name");
        System.out.println("--------------------------------------");
        return student;
    }
}
