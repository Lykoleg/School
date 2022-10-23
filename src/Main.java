
import com.school.Model.*;
import com.school.Service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // ініціалізуємо змінну courseService та викликаємо конструктор
        CourseService courseService = new CourseService();
        //створюємо новий курс з ім'ям Математика
       Course course = courseService.createNewCourse("Mathematics");
        //Course course1 = courseService.createNewCourse();

        // викликаємо конструктор HWService і зберігаємо те що він повертає в змінну
        HomeworkService homeworkService = new HomeworkService();
        // createNewHomework  повертає нове дом завдання(1,2....) в змінну homework
        Homework homework = homeworkService.createNewHomework(" Page 1 ex 23");
       //Homework homework1 = homeworkService.createNewHomework();

        LectureService lectureService = new LectureService();
        Lecture lecture =  lectureService.createNewLecture("Matematics");
        Lecture lecture1 =  lectureService.createNewLecture("Addition");
        Lecture lecture2 =  lectureService.createNewLecture("Subtraction");
        Lecture lecture3 =  lectureService.createNewLecture("Multiplication");
        Lecture lecture4 = lectureService.createNewLecture("Division");
        Lecture lecture5 = lectureService.createNewLecture("Division1");
        lectureService.printTotalCounter();

        StudentService studentService = new StudentService();
        Student student =  studentService.createNewStudent("One name, second name");

        TeacherService teacherService = new TeacherService();
        Teacher teacher =  teacherService.createNewTeacher("One name, second name");

        WorkPlusService workPlustService = new WorkPlusService();
        //WorkPlus workPlus =  workPlusService.createNewWorkPlus("One name, second name");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select category");
        System.out.println("1. Select Course : ");
        System.out.println("2. Select Lecture :");
        System.out.println("3. Select Teacher :");
        System.out.println("4. Select Student :");
        System.out.println("5. Select Homework :");

        int category = scanner.nextInt();
        switch (category)
        {
            case 1:
                System.out.println("Category Course");
                break;
            case 2:
                System.out.println("Category Lecture");
                break;
            case 3:
                System.out.println("Category Teacher");
                break;
            case 4:
                System.out.println("Category Student");
                break;
            case 5:
                System.out.println("Category Homework");
                break;
            case 6:
                System.out.println("Category Plus Homework");
                break;
            default:
                System.out.println("No such category exist");
        }
    }
}