package com.school.Service;


import com.school.Model.*;

public class StudentService {
    public Student createNewStudent() {
        Student student = new Student();
        System.out.println("Student counter " + Student.getCounter());
        return student;
    }
}
