package com.school.service;

import com.school.model.*;

public class HomeworkService {
    //метод створення нового обєкта Homework
    public Homework createNewHomework(String name) {
        Homework homework = new Homework(name);
        System.out.println("Course counter " + Course.getCounter());
        System.out.println("homework counter " + Homework.getCounter());
        System.out.println(" Homework name ");
        System.out.println("--------------------------------------");
        return homework;
        // або одною строчкою:return new Homework();
    }
}


