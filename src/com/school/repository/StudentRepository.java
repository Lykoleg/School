package com.school.repository;

import com.school.model.Student;
import com.school.model.Teacher;

public class StudentRepository {
    int CAPACITY = 10;
    Student[] students = new Student[CAPACITY];
}
