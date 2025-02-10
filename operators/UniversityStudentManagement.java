package com.bridgelabz.operators;
class Student {
    String universityName="SRM";
    String name;
    final int rollNumber;
    String grade;
    static int totalStudents=0;
    Student(String name, int rollNumber,String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    void displayDetails() {
        System.out.println("University Name: " + universityName);
        System.out.println("Name: " + name + "\nRoll Number: " + rollNumber);
    }
    static void displayTotalStudents() {
        System.out.println("\nTotal students in the university is :"+totalStudents);
    }
}
public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student studentOne = new Student("Ravi", 1001,"A");
        Student studentTwo = new Student("Suresh", 1002,"B");
        Student studentThree = new Student("Harry", 1003,"C");
        System.out.println("\nIs studentOne object is instance of Student class:"+(studentOne instanceof Student));
        System.out.println("Details of first student:");
        studentOne.displayDetails();
        System.out.println("\nIs studentTwo object is instance of Student class:"+(studentTwo instanceof Student));
        System.out.println("Details of second student:");
        studentTwo.displayDetails();
        System.out.println("\nIs studentThree object is instance of Student class:"+(studentThree instanceof Student));
        System.out.println("Details of third student:");
        studentThree.displayDetails();
        Student.displayTotalStudents();
    }
}