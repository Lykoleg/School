package com.school.Service;

import com.school.Model.*;

public class HomeworkService {
    //метод створення нового обєкта Homework
    public Homework createNewHomework(){
     Homework homework = new Homework();
     System.out.println("homework counter "+ Homework.getCounter() );
     return homework;
       // або одною строчкою:return new Homework();
    }
    // створюємо порожній конструктор
    public HomeworkService() {
       System.out.println("Construktor HomeworkService");
    }
}
