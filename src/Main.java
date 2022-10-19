
import com.school.Model.*;
import com.school.Service.*;
public class Main {
    public static void main(String[] args){
        CourseService courseService = new CourseService();
       // Course course = courseService.createNewCourse();
        //Course course1 = courseService.createNewCourse();

        // викликаємо конструктор HWService і зберігаємо те що він повертає в змінну
        HomeworkService homeworkService = new HomeworkService();
        //createNewHomework  повертає нове дом завдання(1,2....) в змінну homework
       //Homework homework = homeworkService.createNewHomework();
       //Homework homework1 = homeworkService.createNewHomework();

        LectureService lectureService = new LectureService();
        Lecture lecture =  lectureService.createNewLecture();
        Lecture lecture1 =  lectureService.createNewLecture();
        Lecture lecture2 =  lectureService.createNewLecture();
        Lecture lecture3 =  lectureService.createNewLecture();
        Lecture lecture444 = lectureService.createNewLecture();
    }
}