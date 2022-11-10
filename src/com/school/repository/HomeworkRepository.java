package com.school.repository;

import com.school.model.Homework;
import com.school.model.Lecture;

public class HomeworkRepository {
    int CAPACITY = 10;
    Homework[] homeworks = new Homework[CAPACITY];
}
