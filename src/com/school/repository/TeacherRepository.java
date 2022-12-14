package com.school.repository;

import com.school.model.Teacher;

public class TeacherRepository {
    int CAPACITY = 10;


    Teacher[] teachers = new Teacher[CAPACITY];

    public Teacher[] getTeachers() {
        return teachers;
    }
}



