package com.bridgelabz.operators;
class Patient{
    static String hospitalName="AIMS";
    String patientName;
    int age;
    String ailment;
    final int patientId;
    static int totalPatients=0;
    Patient(int patientId,String patientName,int age,String ailment){
        this.patientId=patientId;
        this.patientName=patientName;
        this.age=age;
        this.ailment=ailment;
        totalPatients++;
    }
    public void displayPatientDetails(){
        System.out.println("Hospital Name: "+hospitalName);
        System.out.println("Patient ID: "+patientId);
        System.out.println("Patient Name: "+patientName);
        System.out.println("Patient Age: "+age);
        System.out.println("Patient Ailment: "+ailment);
    }
    public static void getTotalPatients(){
        System.out.println("\nTotal number of patients is:"+totalPatients);
    }
}
public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient patientOne=new Patient(1,"Ravi",27,"Cough");
        Patient patientTwo=new Patient(2,"john",32,"Cold");
        Patient patientThree=new Patient(3,"Henry",29,"Fever");
        System.out.println("\nIs patientOne object is instance of Patient class:"+(patientOne instanceof Patient));
        System.out.println("Details of first patient:");
        patientOne.displayPatientDetails();
        System.out.println("\nIs patientTwo object is instance of Patient class:"+(patientTwo instanceof Patient));
        System.out.println("Details of second patient:");
        patientTwo.displayPatientDetails();
        System.out.println("\nIs patientThree object is instance of Patient class:"+(patientThree instanceof Patient));
        System.out.println("Details of third patient:");
        patientThree.displayPatientDetails();
        Patient.getTotalPatients();
    }
}