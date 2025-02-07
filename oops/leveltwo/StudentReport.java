package com.bridgelabz.oops.leveltwo;

import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    int marks,numberOfSubjects;
    void calculateGrade() {
        float percentage = ((float)marks) /(numberOfSubjects*100)*100;
        System.out.println("Percentage: "+String.format("%.2f",percentage));
        if(percentage>=90){
            System.out.println("Grade: A");
        }
        else if(percentage>=80){
            System.out.println("Grade: B");
        }
        else if(percentage>=70){
            System.out.println("Grade: C");
        }
        else if(percentage>=60){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F");
        }
    }
    void displayDetails() {
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Name: "+name);
        System.out.println("Total marks received by student : "+marks);
    }
}
public class StudentReport {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter roll number: ");
        int rollNumber=scanner.nextInt();
        System.out.println("Enter name of student : ");
        String name=scanner.next();
        System.out.println("Enter number of subjects: ");
        int numberOfSubjects=scanner.nextInt();
        System.out.println("Enter total marks : ");
        int marks=scanner.nextInt();
        Student student=new Student();

        student.rollNumber=rollNumber;
        student.name=name;
        student.marks=marks;
        student.numberOfSubjects=numberOfSubjects;

        student.displayDetails();
        student.calculateGrade();
        scanner.close();
    }
}