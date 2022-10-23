package com.school.Service;

import com.school.Model.*;

public class TeacherService {
    public Teacher createNewTeacher(String name) {
        Teacher teacher = new Teacher();
        System.out.println("Course counter " + Course.getCounter());
        System.out.println("Teacher counter " + Teacher.getCounter());
        System.out.println("Teacher one name");
        System.out.println("Teacher second name");
        System.out.println("--------------------------------------");
        return teacher;
    }

    }
