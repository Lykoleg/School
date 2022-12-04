package com.school.repository;

import com.school.model.Course;
import com.school.model.Homework;

public class CourseRepository extends Repository {

    Course[] courses = new Course[CAPACITY];


    public Course[] getCourses() {
        return courses;
    }


}

