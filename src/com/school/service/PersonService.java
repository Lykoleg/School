package com.school.service;


import com.school.model.*;
import com.school.repository.ArrayAll;
import com.school.repository.PersonRepository;

import java.util.Scanner;

public class PersonService {
    ArrayAll<Person> pRepository = new ArrayAll<>() ;

    public PersonService() {
        pRepository.arrayAll =new Person[10];
    }

    public Person createNewStudent() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first name");
        String firstName = scanner.next();

        System.out.println("enter last name");
        String lastName = scanner.next();

        String phone;
        boolean isValid;
        do {
            System.out.println("enter phone");
            phone = scanner.next();
            isValid = Util.validatePhone(phone);
            if (isValid == false) {
                System.out.println("try again?");
                System.out.println("1. enter phone again :");
                System.out.println("2. i have no phone :");
                System.out.println("3. else  --  exit :");
                int whatYouDo = scanner.nextInt();
                switch (whatYouDo) {
                    case 1:
                        System.out.println("1. enter phone against :");
                        // перйти до введення нового номера тлф
                        // Util.validatePhone(phone);
                        break;
                    case 2:
                        System.out.println("2. i has not phone :");
                        isValid = true;
                        phone = "";
                        break;
                    default:
                        System.out.println("Exit");
                        return null;
                }
            }
        }
        while (!isValid);

        String email;
        do {
            System.out.println("enter email");
            email = scanner.next();
            isValid = Util.validateEmail(email);
            if (isValid == false) {
                System.out.println("try again?");
                System.out.println("1. enter email again :");
                System.out.println("2. i have no email :");
                System.out.println("3. else  --  exit :");
                int whatYouDo = scanner.nextInt();
                switch (whatYouDo) {
                    case 1:
                        System.out.println("1. enter email against :");
                        // перйти до введення нової адреси ел пошти
                        // Util.validateEmail(email);
                        break;
                    case 2:
                        System.out.println("2. i has not email :");
                        isValid = true;
                        email = "";
                        break;
                    default:
                        System.out.println("Exit");
                        return null;
                }
            }
        }
        while (!isValid);

        System.out.println("enter courseId");
        int courseId = scanner.nextInt();

        Person person = new Person(firstName, lastName, phone, email, Person.Role.STUDENT);
        System.out.println("Student " + firstName + lastName + phone + email);
        pRepository.add(person);
        System.out.println("--------------------------------------");
        return person;
    }

    public Person createNewTeacher() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first name");
        String firstName = scanner.next();

        System.out.println("enter last name");
        String lastName = scanner.next();

        System.out.println("enter personId");
        String personId = scanner.next();

        String phone;
        boolean isValid;
        do {
            System.out.println("enter phone");
            phone = scanner.next();
            isValid = Util.validatePhone(phone);
            if (isValid == false) {
                System.out.println("try again?");
                System.out.println("1. enter phone again :");
                System.out.println("2. i have no phone :");
                System.out.println("3. else  --  exit :");
                int whatYouDo = scanner.nextInt();
                switch (whatYouDo) {
                    case 1:
                        System.out.println("1. enter phone against :");
                        // перйти до введення нового номера тлф
                        // Util.validatePhone(phone);
                        break;
                    case 2:
                        System.out.println("2. i has not phone :");
                        isValid = true;
                        phone = "";
                        break;
                    default:
                        System.out.println("Exit");
                        return null;
                }
            }
        }
        while (!isValid);

        String email;
        do {
            System.out.println("enter email");
            email = scanner.next();
            isValid = Util.validateEmail(email);
            if (isValid == false) {
                System.out.println("try again?");
                System.out.println("1. enter email again :");
                System.out.println("2. i have no email :");
                System.out.println("3. else  --  exit :");
                int whatYouDo = scanner.nextInt();
                switch (whatYouDo) {
                    case 1:
                        System.out.println("1. enter email against :");
                        // перйти до введення нової адреси ел пошти
                        // Util.validateEmail(email);
                        break;
                    case 2:
                        System.out.println("2. i has not email :");
                        isValid = true;
                        email = "";
                        break;
                    default:
                        System.out.println("Exit");
                        return null;
                }
            }
        }
        while (!isValid);


        System.out.println("enter courseId");
        int courseId = scanner.nextInt();

        Person person = new Person(firstName, lastName, phone, email, Person.Role.TEACHER);
        System.out.println("Teacher " + firstName + lastName + phone + email);

        System.out.println("--------------------------------------");
        return person;
    }


}
