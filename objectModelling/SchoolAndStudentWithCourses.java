package com.bridgelabz.objectModelling;

import java.util.ArrayList;

//School class,to store student details
class School{
    String schoolName;
    ArrayList<Student> students;
    School(String schoolName){
        this.schoolName=schoolName;
        this.students=new ArrayList<>();
    }
    //Adding students in school
    void addStudent(Student student){
        students.add(student);
    }
    void displayStudents(){
        System.out.println("\nStudents in "+schoolName+" are: ");
        for(Student student:students){
            System.out.println(student.studentName);
        }
    }
}

//Student class, to store student and their course details
class Student{
    String studentName;
    ArrayList<Course> courses;

    Student(String studentName){
        this.studentName=studentName;
        this.courses=new ArrayList<>();
    }
    //Enrolling students in different courses
    void enrollInCourse(Course course){
        courses.add(course);
        course.enrollStudentInCourse(this);
    }
    void displayCourses(){
        System.out.println("\n"+studentName+" enrolled in  ");
        for(Course course:courses){
            System.out.println(course.courseName);
        }
    }
}

//Course class
class Course{
    String courseName;
    ArrayList<Student> students;
    Course(String courseName){
        this.courseName=courseName;
        this.students=new ArrayList<>();
    }
    //Adding students to a particular course
    void enrollStudentInCourse(Student student){
        students.add(student);
    }
    void displayEnrolledStudents(){
        System.out.println("\nStudents enrolled in " + courseName + ":");
            for(Student student:students){
                System.out.println(student.studentName);
        }
    }
}
public class SchoolAndStudentWithCourses {
    public static void main(String[] args) {
        //Creating school objects
        School schoolOne=new School("Sri Chaitanya");
        School schoolTwo=new School("Narayana");
        //Creating course objects
        Course courseOne=new Course("Java");
        Course courseTwo=new Course("C++");
        Course courseThree=new Course("Python");
        //Creating student objects
        Student studentOne=new Student("Ravi");
        Student studentTwo=new Student("Suresh");
        Student studentThree=new Student("Harry");
        //Add students in schools
        schoolOne.addStudent(studentOne);
        schoolTwo.addStudent(studentTwo);
        schoolTwo.addStudent(studentThree);
        //Display students
        schoolOne.displayStudents();
        schoolTwo.displayStudents();
        //Enroll students in courses
        studentOne.enrollInCourse(courseOne);
        studentOne.enrollInCourse(courseTwo);

        studentTwo.enrollInCourse(courseTwo);
        studentTwo.enrollInCourse(courseThree);

        studentThree.enrollInCourse(courseThree);
        studentThree.enrollInCourse(courseOne);
        studentThree.enrollInCourse(courseTwo);

        System.out.println("\nUsing relationship between course and student");
        System.out.println("Student can view their enrolled courses");
        studentOne.displayCourses();
        studentTwo.displayCourses();
        studentThree.displayCourses();

        System.out.println("\nStudents in each course are: ");
        courseOne.displayEnrolledStudents();
        courseTwo.displayEnrolledStudents();
        courseThree.displayEnrolledStudents();
    }
}