package com.school.repository;

import com.school.model.Homework;
import com.school.model.Lecture;

public class HomeworkRepository extends Repository{
    int CAPACITY = 10;
    Homework[] homeworks = new Homework[CAPACITY];

    public Homework[] getHomeworks() {
        return homeworks;
    }



}
