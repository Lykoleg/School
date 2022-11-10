
import com.school.model.*;
import com.school.repository.*;
import com.school.service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ініціалізуємо змінну courseService та викликаємо конструктор
        CourseService courseService = new CourseService();
        //створюємо новий курс з ім'ям Математика
        Course course = courseService.createNewCourse("Mathematics");
        //Course course1 = courseService.createNewCourse();
        courseService.printCourses();

        // викликаємо конструктор HWService і зберігаємо те що він повертає в змінну
        HomeworkService homeworkService = new HomeworkService();
        // createNewHomework  повертає нове дом завдання(1,2....) в змінну homework

        //Homework homework1 = homeworkService.createNewHomework();

        LectureService lectureService = new LectureService();

        Lecture lecture = lectureService.createNewLecture("Lecture one",  course.getID());
        Lecture lecture2 = lectureService.createNewLecture("Lecture second",   course.getID());
        Lecture lecture3 = lectureService.createNewLecture("Lecture third",   course.getID());


        StudentService studentService = new StudentService();
        //Student student = studentService.createNewStudent("One name, second name");

        TeacherService teacherService = new TeacherService();
        //Teacher teacher = teacherService.createNewTeacher("One name, second name");

        WorkPlusService workPlusService = new WorkPlusService();
        //WorkPlus workPlus =  workPlusService.createNewWorkPlus("One name, second name");


        HomeworkRepository homeworkRepository = new HomeworkRepository();
        LectureRepository lectureRepository = new LectureRepository();
        StudentRepository studentRepository = new StudentRepository();
        TeacherRepository teacherRepository = new TeacherRepository();
        WorkPlusRepository workPlusRepository = new WorkPlusRepository();


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Select category");
        System.out.println("1. Select Course : ");
        System.out.println("2. Select Lecture :");
        System.out.println("3. Select Teacher :");
        System.out.println("4. Select Student :");
        System.out.println("5. Select Homework :");
        System.out.println("6. Select WorkPlus :");

        int category = scanner.nextInt();
        switch (category) {
            case 1:
                System.out.println("Category Course");
                //implemented for Course1 Lecture1

                System.out.println("1. Select Course1 :");
                System.out.println("2. Select Course2 :");
                System.out.println("3. Select Course3 :");
                System.out.println("4. Select Course4 :");
                System.out.println("5. Select Course5 :");
                int categoryCourse = scanner.nextInt();
                switch (categoryCourse) {
                    case 1:
                        System.out.println("Category Lecture Course1");

                        System.out.println("1. Select Lecture1 Course1 :");
                        System.out.println("2. Select Lecture2 Course1 :");
                        System.out.println("3. Select Lecture3 Course1 :");
                        System.out.println("4. Select Lecture4 Course1 :");
                        System.out.println("5. Select Lecture5 Course1 :");
                        System.out.println("5. Select Lecture6 Course1 :");
                        int categoryLectureCourse = scanner.nextInt();
                        switch (categoryLectureCourse) {
                            case 1:
                                System.out.println("Category Lecture1 Course1");
                                break;
                            case 2:
                                System.out.println("Category Lecture2 Course1");
                                break;
                            case 3:
                                System.out.println("Category Lecture3 Course1");
                                break;
                            case 4:
                                System.out.println("Category Lecture4 Course1");
                                break;
                            case 5:
                                System.out.println("Category Lecture5 Course1");
                                break;
                            case 6:
                                System.out.println("Category Lecture6 Course1");
                                break;
                            default:
                                System.out.println("No such category exist");
                        }
                        break;
                    case 2:
                        System.out.println("Category Course2");
                        break;
                    case 3:
                        System.out.println("Category Course3");
                        break;
                    case 4:
                        System.out.println("Category Course4");
                        break;
                    case 5:
                        System.out.println("Category Course5");
                        break;
                    case 6:
                        System.out.println("Category Course6");
                        break;
                    default:
                        System.out.println("No such category exist");
                }
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
        int create = 1;
        for (; create == 1; ) {
            System.out.println("Create Lecture");
            System.out.println("1. YES ");
            System.out.println("2. No ");
            create = scanner.nextInt();

            switch (create) {
                case 1:
                    System.out.println("enter name");
                    String lectureName = scanner.next();
                    lectureService.createNewLecture(lectureName, course.getID());
                    System.out.println("Lecture counter " + Lecture.getCounter());

                case 2:
                    break;

         */
            }

        }

