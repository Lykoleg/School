package com.school.service;

import com.school.model.*;

public class WorkPlusService {

    public WorkPlusService createNewWorkPlus(String name) {
        WorkPlusService workPlusService = new WorkPlusService();
        System.out.println("Course counter " + Course.getCounter());
        System.out.println("WorkPlusService counter " + WorkPlus.getCounter());
        System.out.println("WorkPlus name");
        System.out.println("--------------------------------------");
        return workPlusService;
    }
}