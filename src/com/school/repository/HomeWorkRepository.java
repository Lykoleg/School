package com.school.repository;

import com.school.model.HomeWork;

public class HomeWorkRepository extends Repository{
    int CAPACITY = 10;
    HomeWork[] homeworks = new HomeWork[CAPACITY];

    public HomeWork[] getHomeworks() {
        return homeworks;
    }



}
