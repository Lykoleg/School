package com.school.service;

import com.school.model.*;
import com.school.repository.LectureRepository;

public class LectureService {
    LectureRepository lectureRepository = new LectureRepository();



    public Lecture createNewLecture(String name, String description,int personId) {
        if (Lecture.getCounter() < 8) {


            Lecture lecture = new Lecture(name,description,personId);
            lectureRepository.add(lecture);

            System.out.println("Course counter " + Course.getCounter());
            System.out.println("Lecture counter " + Lecture.getCounter());
            System.out.println("  Lecture name " + name );

            System.out.println("--------------------------------------");


            //public void printTotalCounter()
            System.out.println("total lecture  = " + Lecture.getCounter());
            System.out.println("--------------------------------------");
            System.out.println();
            return lecture;
        } else {

            System.out.println(" lecture limit exceeded , exit");
            return null;

        }
    }
    public Lecture addTeacher(int personId, int lectureId){
        Lecture lecture=lectureRepository.getById(lectureId);
        lecture.setPersonId(personId);


        return lecture;

    }
}



