package com.school.repository;

import com.school.model.Course;
import com.school.model.Lecture;
import com.school.model.Model;
import com.school.model.Teacher;

public class LectureRepository extends Repository {


    Lecture[] lectures = new Lecture[CAPACITY];

    public Lecture[] getLectures() {
        return lectures;
    }
    public void add(Lecture lecture) {
        for (int i = 0; i < lectures.length; i++) {
            if (lectures[i] == null) {
                lectures[i] = lecture;
                System.out.print(" Add lecture" + lecture);
                return;
            }
        }
        expandArray();
        add(lecture);
    }
    private void expandArray() {
        int tmpCapacity = CAPACITY;
        CAPACITY = (CAPACITY * 3) / 2 + 1;
        Lecture[] tmpArray = new Lecture[CAPACITY];
        System.arraycopy(lectures, 0, tmpArray, 0, tmpCapacity);
        lectures = tmpArray;
    }
    public void delete(String name) {
        for (int i = 0; i < lectures.length; i++) {
            if (lectures[i].getName().equals(name)) {
                lectures[i] = null;
                System.out.print(" Delete Arrays model " + name);
                break;//видалення за ім'ям


            }
        }
    }
    public void delete(int ID) {
        for (int i = 0; i < lectures.length; i++) {
            if (lectures[i].getID() == (ID)) {
                String name = lectures[i].getName();
                lectures[i] = null;
                System.out.print(" Delete Arrays model " + name + "  " + ID);
                break;
            }  //видалення за ID

        }

    }
    public Lecture getById(int ID) {
        for (int i = 0; i < lectures.length; i++) {
            if (lectures[i].getID() == (ID)) {
                String name = lectures[i].getName();
                System.out.println(lectures[i]);
                return lectures[i];
            }  //виклик за ID

        }
        System.out.println("No lecture with this ID" + ID);
        return null;
    }


}

