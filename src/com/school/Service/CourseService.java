package com.school.Service;

import com.school.Model.*;

//import com.school.*;
public class CourseService {
    public String name;
    public Course createNewCourse(String name) {
        Course course = new Course();
        System.out.println("Course counter " + Course.getCounter());
        System.out.println("Course name   ");
        System.out.println("--------------------------------------");
        return course;
    }
}

