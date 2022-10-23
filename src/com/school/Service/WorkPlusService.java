package com.school.Service;

import com.school.Model.*;

public class WorkPlusService {
    public WorkPlusService createWorkPlusService() {
        WorkPlusService workPlusService = new WorkPlusService();
        System.out.println("Course counter " + Course.getCounter());
        System.out.println("WorkPlusService counter " + WorkPlus.getCounter());
        System.out.println("Work name");
        System.out.println("--------------------------------------");
        return workPlusService;
    }}