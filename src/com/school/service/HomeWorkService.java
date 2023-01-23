package com.school.service;

import com.school.model.*;
import com.school.repository.ArrayAll;

import java.util.Scanner;

public class HomeWorkService {
    ArrayAll<HomeWork> homeWorkArrayAll = new ArrayAll<>();
    public HomeWorkService() {
        homeWorkArrayAll.arrayAll =new HomeWork[10];
    }    public HomeWork createNewHomework() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter name New Homework");
        String name = scanner.next();
        System.out.println("enter Id New Homework");
        int Id = scanner.nextInt();

        HomeWork homework = new HomeWork(name);


        //System.out.println("Course counter " + Course.getCounter());
        //System.out.println("homework counter " + Homework.getCounter());
        System.out.println(" Homework name   " + name);
        System.out.println("--------------------------------------");
        return homework;
        // або одною строчкою:return new Homework();
    }
}


