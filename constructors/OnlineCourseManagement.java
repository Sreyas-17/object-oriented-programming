package com.bridgelabz.constructors;

import java.util.Scanner;

class Course{
    String courseName;
    int duration;
    int fee;
    static String instituteName="Udemy";
    Course(String courseName, int duration,int fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }
    void displayCourseDetails(){
        System.out.println("Course name is: "+courseName);
        System.out.println("Duration is: "+duration);
        System.out.println("Fee is: "+fee);
        System.out.println("Institute name is: "+instituteName);
    }
    void updateInstituteName(String instituteName){
        Course.instituteName =instituteName;
    }

}
public class OnlineCourseManagement {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the course name: ");
        String courseName=scanner.nextLine();
        System.out.println("Enter the course duration in minutes: ");
        int duration=scanner.nextInt();
        System.out.println("Enter the course fee: ");
        int fee=scanner.nextInt();
        Course course=new Course(courseName, duration, fee);
        course.displayCourseDetails();
        System.out.println("Enter the institute name to update: ");
        String instituteName=scanner.next();
        course.updateInstituteName(instituteName);
        System.out.println("The details after updating: ");
        course.displayCourseDetails();
        scanner.close();
    }
}
