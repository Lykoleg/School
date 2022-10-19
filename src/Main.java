
import com.school.Model.*;
import com.school.Service.*;
public class Main {
    public static void main(String[] args){
        CourseService сourseService = new CourseService();
        Course course = сourseService.createNewCourse();
        Course course1 = сourseService.createNewCourse();

        // викликаємо конструктор HWService і зберігаємо те що він повертає в змінну
        HomeworkService homeworkService = new HomeworkService();
        //createNewHomework  повертає нове дом завдання(1,2....) в змінну homework
       Homework homework = homeworkService.createNewHomework();
       Homework homework1 = homeworkService.createNewHomework();

        LectureService lectureService = new LectureService();
        Lecture lecture =  lectureService.createNewLecture();
        Lecture lecture1 =  lectureService.createNewLecture();
        Lecture lecture2 =  lectureService.createNewLecture();
        Lecture lecture3 =  lectureService.createNewLecture();
        Lecture lecture4 = lectureService.createNewLecture();
    }
}