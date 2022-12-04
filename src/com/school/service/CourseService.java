package com.school.service;

import com.school.model.*;
import com.school.repository.CourseRepository;

public class CourseService {
    //public String name;
    CourseRepository courseRepository = new CourseRepository();

    public void printCourses(){

        Course[] courses = courseRepository.getCourses();
        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i]);
        }
    }


    public Course createNewCourse(String name) {
        Course course = new Course(name);

        courseRepository.add(course);
        System.out.println("Course counter " +    Course.getCounter());
        System.out.println("Course name   " +    course);
        System.out.println("--------------------------------------");

        return course;
    }


}

