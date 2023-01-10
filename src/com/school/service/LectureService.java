package com.school.service;

import com.school.model.*;
import com.school.repository.LectureRepository;

import java.util.Scanner;

public class LectureService {
    LectureRepository lectureRepository = new LectureRepository();


    public Lecture createNewLecture() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        String name = scanner.next();
        System.out.println("enter description");
        String description = scanner.next();
        System.out.println("enter personId");
        int personId = scanner.nextInt();


        Lecture lecture = new Lecture(name, description, personId);
        lectureRepository.add(lecture);

        System.out.println("Course counter " + Course.getCounter());
        System.out.println("Lecture counter " + Lecture.getCounter());
        System.out.println("  Lecture name " + name);

        System.out.println("--------------------------------------");


        //public void printTotalCounter()
        System.out.println("total lecture  = " + Lecture.getCounter());
        System.out.println("--------------------------------------");
        System.out.println();
        return lecture;

    }

    public Lecture addTeacher(int personId, int lectureId) {
        Lecture lecture = lectureRepository.getById(lectureId);
        lecture.setPersonId(personId);


        return lecture;

    }
}



