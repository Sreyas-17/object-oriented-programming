package com.bridgelabz.objectModelling;

import java.util.ArrayList;

class Professor {
    String professorName;
    ArrayList<CourseDetails> courseDetails;
    ArrayList<StudentEnrollment> studentEnrollments;
    Professor(String professorName){
        this.professorName=professorName;
        courseDetails=new ArrayList<>();
        studentEnrollments=new ArrayList<>();
    }
    void addStudent(StudentEnrollment studentEnrollment){
        studentEnrollments.add(studentEnrollment);
    }
    void addCourse(CourseDetails courseDetails){
        this.courseDetails.add(courseDetails);
    }
    void displayCourseDetails(){
        System.out.println(professorName+" teaches following courses:");
        for(CourseDetails courseDetails:courseDetails){
            System.out.println(courseDetails.courseName);
        }

        System.out.println("\n"+professorName+" teaches following students:");
        for(StudentEnrollment studentEnrollment:studentEnrollments){
            System.out.println(studentEnrollment.studentName);
        }
    }
    String getProfessorDetails(){
        return professorName;
    }
}
class StudentEnrollment {
    String studentName;
    int rollNumber;
    ArrayList<CourseDetails> courseDetails;
    ArrayList<Professor> professors;
    StudentEnrollment(String studentName, int rollNumber){
        this.studentName=studentName;
        this.rollNumber=rollNumber;
        courseDetails=new ArrayList<>();
        professors=new ArrayList<>();
    }
    void enrollCourse(CourseDetails courseDetails){
        this.courseDetails.add(courseDetails);
    }
    void assignProfessor(Professor professor){
        professors.add(professor);
        professor.addStudent(this);
    }
    void displayCourseDetails(){
        System.out.println(studentName+" is enrolled in following courses:");
        for(CourseDetails courseDetails:courseDetails){
            System.out.println(courseDetails.courseName);
        }
        System.out.println("\n"+studentName+" is assigned to following professors:");
        for(Professor professor:professors){
            System.out.println(professor.getProfessorDetails());
        }
    }
}
class CourseDetails{
    String courseName;
    CourseDetails(String courseName){
        this.courseName=courseName;
    }
}
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create Professors
        Professor professor1 = new Professor("Ravi");
        Professor professor2 = new Professor("Manish");

        // Create Students
        StudentEnrollment student1 = new StudentEnrollment("Kuladeep", 101);
        StudentEnrollment student2 = new StudentEnrollment("Rahul", 102);

        // Create Courses
        CourseDetails course1 = new CourseDetails("Mathematics");
        CourseDetails course2 = new CourseDetails("Computer Science");

        // Assign Professors to Courses
        professor1.addCourse(course1);
        professor2.addCourse(course2);

        // Enroll Students in Courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        // Assign Professors to Students
        student1.assignProfessor(professor1);
        student1.assignProfessor(professor2);
        student2.assignProfessor(professor1);

        // Display Course and Student Details
        professor1.displayCourseDetails();
        professor2.displayCourseDetails();

        student1.displayCourseDetails();
        student2.displayCourseDetails();
    }
}
