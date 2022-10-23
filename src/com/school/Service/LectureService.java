package com.school.Service;

import com.school.Model.*;

public class LectureService {

    public Lecture createNewLecture(String name) {
        Lecture lecture = new Lecture();
        System.out.println("Course counter " + Course.getCounter());
        System.out.println("Lecture counter " + Lecture.getCounter());
        System.out.println("  Lecture name ");

        System.out.println("--------------------------------------");
        return lecture;
    }
    public void printTotalCounter(){
        System.out.println("total lectures  = "  + Lecture.getCounter());
        System.out.println("--------------------------------------");
    }
}
