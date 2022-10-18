package com.school.Service;

import com.school.Model.*;

public class LectureService {
    public Lecture createNewLecture() {
        Lecture lecture = new Lecture();
        System.out.println("Lecture counter " + Lecture.getCounter());
        return lecture;

    }
    }
