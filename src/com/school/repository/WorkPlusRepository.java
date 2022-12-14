package com.school.repository;

import com.school.model.WorkPlus;

public class WorkPlusRepository extends Repository {
    int CAPACITY = 10;
    WorkPlus[] workPluses = new WorkPlus[CAPACITY];

    public WorkPlus[] getWorkPluses() {
        return workPluses;
    }
}
