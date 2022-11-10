package com.school.repository;

import com.school.model.Course;
import com.school.model.Homework;

public class CourseRepository {
    private String name;
    int CAPACITY = 10;
    Course[] courses = new Course[CAPACITY];

    public Course[] getCourses() {
        return courses;
    }
/*public static Course[] getCourses() {
        return getCourses();
   }*/

    public void addCourse(Course course) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = course;
                System.out.print("Course repository "   + Course.getCounter()  +  "  " +  course);
                break;

            }else {
              expandArray();
            }
        }
    }
    private void expandArray(){
        int tmpCapacity = CAPACITY;
        CAPACITY = (CAPACITY * 3) / 2 +1;
        Course[] tmpArrayCourse = new Course[CAPACITY];
        System.arraycopy(courses,0,tmpArrayCourse,0,tmpCapacity);
        courses = tmpArrayCourse;

    }


}
