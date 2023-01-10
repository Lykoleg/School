package com.school.service;

public class Util {
    public static boolean validatePhone(String phone) {
      if  ( phone.matches("\\d{10}")) return true;
      else System.out.println("Number phone not correct. Valid example 9999999999");


      return false;
    }
    public static boolean validateEmail(String email) {
        if (email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) return true;
        else System.out.println("Email not correct. Enter valid email");
        return false;
    }
}
