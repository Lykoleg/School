package com.school.service;

import com.school.model.*;
import com.school.repository.ArrayAll;
import com.school.repository.LectureRepository;

import java.util.Scanner;

public class LectureService {
    ArrayAll<Lecture> lectureRepository = new ArrayAll<>();
    public LectureService() {
        lectureRepository.arrayAll =new Lecture[10];
    }
    // конструктор для інніціалізаціі масиву ЛЕКЦІЙ в полі lectureRepository


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
        lectureRepository.add(lecture);


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



