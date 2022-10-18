package com.school.Service;
import com.school.Model.*;

public class CourseService {
    public Course createNewCourse() {
        Course course = new Course();
         System.out.println("Course counter "+ Course.getCounter() );
        return course;
        }
    }

