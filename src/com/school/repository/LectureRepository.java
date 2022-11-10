package com.school.repository;

import com.school.model.Course;
import com.school.model.Lecture;
import com.school.model.Student;

public class LectureRepository {
    int CAPACITY = 10;
    int i;
    Lecture[] lectures = new Lecture[CAPACITY];
    public void addLecture(Lecture lecture) {
        for (i = 0; i < lectures.length; i++) {
            if (lectures[i] == null) {
                lectures[i] = lecture;
                System.out.print("Lecture " + Lecture.getCounter() + Course.getCounter() + "  " + lecture);
                break;
            } else {
                expandArray();
            }
        }
    }
    private void expandArray(){
        int tmpCapacity = CAPACITY;
        CAPACITY = (CAPACITY * 3) / 2 +1;
        Lecture[] tmpArrayLecture = new Lecture[CAPACITY];
        System.arraycopy(lectures,0,tmpArrayLecture,0,tmpCapacity);
        lectures = tmpArrayLecture;

    }
}
