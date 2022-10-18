package com.school.Service;

import com.school.Model.*;

public class TeacherService {
    public Teacher createNewTeacher() {
        Teacher teacher = new Teacher();
        System.out.println("Teacher counter " + Teacher.getCounter());
        return teacher;
    }

    }
