package com.school.service;

import com.school.model.*;

import java.util.Scanner;

public class HomeworkService {
    //метод створення нового обєкта HomeWork
    public Homework createNewHomework() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter name New Homework");
        String name = scanner.next();
        System.out.println("enter Id New Homework");
        int Id = scanner.nextInt();

        Homework homework = new Homework(name);


        //System.out.println("Course counter " + Course.getCounter());
        //System.out.println("homework counter " + Homework.getCounter());
        System.out.println(" Homework name   " + name);
        System.out.println("--------------------------------------");
        return homework;
        // або одною строчкою:return new Homework();
    }
}


