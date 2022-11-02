package com.school.Service;

import com.school.Model.*;

public class LectureService {

    public Lecture createNewLecture(String name, int courseID) {
        if (Lecture.getCounter() < 8) {

            Lecture lecture = new Lecture(name, courseID);
            System.out.println("Course counter " + Course.getCounter());
            System.out.println("Lecture counter " + Lecture.getCounter());
            System.out.println("  Lecture name " + name + "   with course " + courseID);

            System.out.println("--------------------------------------");


            //public void printTotalCounter()
            System.out.println("total lectures  = " + Lecture.getCounter());
            System.out.println("--------------------------------------");
            return lecture;
        } else {

            System.out.println(" lecture limit exceeded , exit");
            return null;

        }
    }
}



