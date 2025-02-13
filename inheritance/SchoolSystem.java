package com.bridgelabz.inheritance;

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void displayDetails(){
        System.out.println("\nName: "+name);
        System.out.println("Age: "+age);
    }
}
class Teacher extends Person{
    private String subject;

    public Teacher(String name, int age,String subject){
        super(name, age);
        this.subject=subject;
    }

    public void displayRole(){
        System.out.println("Teacher role");
        System.out.println("Subject: "+subject);
    }
}
class Student extends Person{
    private String grade;

    public Student(String name, int age,String grade){
        super(name, age);
        this.grade=grade;
    }

    public void displayRole(){
        System.out.println("Student role");
        System.out.println("Grade: "+grade);
    }
}
class Staff extends Person{
    private String department;

    public Staff(String name,int age,String department){
        super(name, age);
        this.department=department;
    }

    public void displayRole(){
        System.out.println("Department(Staff role): "+department);
    }
}
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Ravi", 20, "Maths");
        teacher.displayDetails();
        teacher.displayRole();

        Student student=new Student("Suresh", 20, "10th");
        student.displayDetails();
        student.displayRole();

        Staff staff=new Staff("Manish", 20, "Networking");
        staff.displayDetails();
        staff.displayRole();
    }
}
