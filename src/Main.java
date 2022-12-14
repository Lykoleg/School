
import com.school.model.*;
import com.school.repository.*;
import com.school.service.*;

import java.util.Scanner;

public class Main {
    private String oneName, secondName;
    public static void main(String[] args) {

        CourseService courseService = new CourseService();

        Course course = courseService.createNewCourse("Mathematics");

        courseService.printCourses();
        String noSuchCategoryError="No such category exist";



        HomeworkService homeworkService = new HomeworkService();


        LectureService lectureService = new LectureService();
        Lecture lecture = lectureService.createNewLecture("Lecture one","my lecture about France",0001);



        PersonService personService = new PersonService();
        Person person = personService.createNewStudent("One name", 0001);



        WorkPlusService workPlusService = new WorkPlusService();



        HomeworkRepository homeworkRepository = new HomeworkRepository();

        WorkPlusRepository workPlusRepository = new WorkPlusRepository();


        Scanner scanner = new Scanner(System.in);
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

                                System.out.println(noSuchCategoryError);
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
                        System.out.println(noSuchCategoryError);
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
                System.out.println(noSuchCategoryError);
        }
        int create = 1;
        while ( create == 1 ) {
            System.out.println("Create Lecture");
            System.out.println("1. YES ");
            System.out.println("2. No ");
            create = scanner.nextInt();

            switch (create) {
                case 1:
                    System.out.println("enter name");
                    String lectureName = scanner.next();
                    lectureService.createNewLecture(lectureName,"my description",0001);
                    System.out.println("Lecture counter " + Lecture.getCounter());

                case 2:
                    break;
                default:
                    System.out.println("error");

                }
            }

        }
    }
