package com.bridgelabz.objectModelling;

import java.util.ArrayList;

class University{
    ArrayList<Departments> departments;
    String universityName;
    University(String universityName){
        this.universityName=universityName;
        departments=new ArrayList<>();
    }
    void addDepartment(Departments departments){
        this.departments.add(departments);
    }
    void removeUniversity(){
        System.out.println("\nUniversity " + universityName + " is being removed.");
        universityName=" ";
        System.out.println("All departments are deleted in university.");
        departments=null;
    }
    void displayUniversityDetails(){
        System.out.println("University Name: "+universityName);
        System.out.println("Departments in university : ");
        try {
            for (Departments department : departments) {
                System.out.println("Department Name: " + department.departmentName);
            }
        }
        catch(NullPointerException e){
            System.out.println("No departments are there in university.");
        }
    }
}
class Departments{
    ArrayList<Faculty> faculties;
    String departmentName;
    Departments(String departmentName){
        this.departmentName=departmentName;
        faculties=new ArrayList<>();
    }
    void addFaculty(Faculty faculty){
        faculties.add(faculty);
    }
    void displayDepartmentDetails(){
        System.out.println("\nFaculties in "+departmentName+" department : ");
        for(Faculty faculty:faculties){
            faculty.getFacultyName();
        }
    }
}
class Faculty{
    String facultyName;
    Faculty(String facultyName){
        this.facultyName=facultyName;
    }
    void getFacultyName(){
        System.out.println("Faculty Name: "+facultyName);
    }
}
public class UniversityWithFacultiesAndDepartments {
    public static void main(String[] args) {
        University university=new University("BridgeLabz");
        Departments departmentOne=new Departments("IT");
        Departments departmentTwo=new Departments("HR");
        Faculty facultyOne=new Faculty("Ravi");
        Faculty facultyTwo=new Faculty("Suresh");
        Faculty facultyThree=new Faculty("Harry");
        Faculty facultyFour=new Faculty("Kishore");
        university.addDepartment(departmentOne);
        departmentOne.addFaculty(facultyOne);
        departmentTwo.addFaculty(facultyThree);
        university.addDepartment(departmentTwo);
        departmentOne.addFaculty(facultyTwo);
        departmentTwo.addFaculty(facultyFour);

        university.displayUniversityDetails();
        departmentOne.displayDepartmentDetails();
        departmentTwo.displayDepartmentDetails();
        university.removeUniversity();
        System.out.println("\nChecking university details after removing university to ensure composition");
        university.displayUniversityDetails();

        System.out.println("\nChecking faculty details after removing department to ensure aggregation");
        facultyOne.getFacultyName();
        facultyTwo.getFacultyName();
        facultyThree.getFacultyName();
        facultyFour.getFacultyName();
    }
}
