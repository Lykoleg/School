package com.school.Service;

import com.school.Model.*;

public class WorkPlusService {
    public WorkPlusService createWorkPlusService() {
        WorkPlusService workPlusService = new WorkPlusService();
        System.out.println("WorkPlusService counter " + WorkPlus.getCounter());
        return workPlusService;
    }}