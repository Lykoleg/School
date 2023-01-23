package com.school.service;

import com.school.model.*;
import com.school.repository.ArrayAll;
import com.school.repository.WorkPlusRepository;

import java.util.Scanner;

public class WorkPlusService {
    ArrayAll<WorkPlus> workPlusArrayAll = new ArrayAll<>();
    public WorkPlusService() {
        workPlusArrayAll.arrayAll =new WorkPlus[10];
    }
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
        workPlusArrayAll.add(workPlus);
        System.out.println("--------------------------------------");
        return workPlus;
    }
}