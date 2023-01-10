
import com.school.model.*;
import com.school.repository.*;
import com.school.service.*;

import java.util.Scanner;

public class Main {
    private String oneName, secondName;

    public static void main(String[] args) {
        String noSuchCategoryError = "No such category exist";

        CourseService courseService = new CourseService();
        HomeworkService homeworkService = new HomeworkService();
        LectureService lectureService = new LectureService();
        PersonService personService = new PersonService();
        WorkPlusService workPlusService = new WorkPlusService();

        //HomeworkRepository homeworkRepository = new HomeworkRepository();
        //WorkPlusRepository workPlusRepository = new WorkPlusRepository();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Select category");
        System.out.println("1. Course : ");
        System.out.println("2. Lecture :");
        System.out.println("3. Person :");
        System.out.println("4. Homework,WorkPlus :");

        int category = scanner.nextInt();
        switch (category) {
            case 1:
                System.out.println("1.createNewCourse :");
                System.out.println("2.printCourses :");
                int categoryCourse = scanner.nextInt();
                switch (categoryCourse) {
                    case 1:
                        System.out.println("1. createNewCourse :");
                        courseService.createNewCourse();
                        break;
                    case 2:
                        System.out.println("2. printCourses :");
                        courseService.printCourses();
                        break;
                    default:
                        System.out.println(noSuchCategoryError);
                        return;
                }


            case 2:
                System.out.println("1. createNewLecture :");
                System.out.println("2. addTeacher :");
                int categoryLecture = scanner.nextInt();
                switch (categoryLecture) {
                    case 1:
                        System.out.println("1. createNewLecture :");
                        lectureService.createNewLecture();
                        break;
                    case 2:
                        System.out.println("2. addTeacher :");
                        System.out.println("enter firstName");
                        String firstName = scanner.next();
                        System.out.println("enter description");
                        String description = scanner.next();
                        System.out.println("enter personId");
                        String personId = scanner.next();
                        break;
                    default:
                        System.out.println(noSuchCategoryError);
                        break;
                }


            case 3:
                System.out.println("1.createNewStudent :");
                System.out.println("2.createNewTeacher :");
                int categoryPerson = scanner.nextInt();
                switch (categoryPerson) {
                    case 1:

                        System.out.println("Category createNewStudent");
                        personService.createNewStudent();
                        break;
                    case 2:
                        System.out.println("Category createNewTeacher");
                        personService.createNewTeacher();
                        break;
                    default:
                        System.out.println(noSuchCategoryError);
                        break;
                }
            case 4:

                System.out.println("1.createNewHomework :");
                System.out.println("2.createNewPlusHomework :");
                int categor = scanner.nextInt();
                switch (categor) {
                    case 1:

                        System.out.println("Category createNewHomework");
                        homeworkService.createNewHomework(); //додам метод
                        break;
                    case 2:
                        System.out.println("Category createNewPlusHomework");
                        workPlusService.createNewWorkPlus(); // додам метод
                        break;
                    default:
                        System.out.println(noSuchCategoryError);

                        break;
                }
//                int create = 1;
//                while (create == 1) {
//                    System.out.println("Create Lecture");
//                    System.out.println("1. YES ");
//                    System.out.println("2. No ");
//                    create = scanner.nextInt();
//
//                    switch (create) {
//                        case 1:
//                            System.out.println("enter name");
//                            // String lectureName = scanner.next();
//                            //lectureService.createNewLecture(lectureName, "my description", 0001);
//                            System.out.println("Lecture counter " + Lecture.getCounter());
//
//                        case 2:
//                            break;
//                        default:
//                            System.out.println("error");
//
//                    }
//                }

        }
    }
}

