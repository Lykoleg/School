package com.school.service;

import com.school.model.*;

public class TeacherService {
    public Teacher createNewTeacher(String name) {
        Teacher teacher = new Teacher(name);
        System.out.println("Course counter " + Course.getCounter());
        System.out.println("Teacher counter " + Teacher.getCounter());
        System.out.println("Teacher one name");
        System.out.println("Teacher second name");
        System.out.println("--------------------------------------");
        return teacher;
    }

    }
