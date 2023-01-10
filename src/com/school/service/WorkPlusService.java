package com.school.service;

import com.school.model.*;

import java.util.Scanner;

public class WorkPlusService {

    public WorkPlus createNewWorkPlus() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter name New HomeworkPlus");
        String name = scanner.next();
        System.out.println("enter Id New HomeworkPlus");
        int Id = scanner.nextInt();
        WorkPlus workPlus = new WorkPlus(name);
        //System.out.println("Course counter " + Course.getCounter());
        //System.out.println("WorkPlusService counter " + WorkPlus.getCounter());
        System.out.println("WorkPlus name    " + name);
        System.out.println("--------------------------------------");
        return workPlus;
    }
}