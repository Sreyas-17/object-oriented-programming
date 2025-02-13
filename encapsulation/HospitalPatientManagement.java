package com.bridgelabz.encapsulation;

import java.util.*;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    protected String patientId;
    protected String name;
    protected int age;
    private String disease;

    public Patient(String patientId, String name, int age, String disease) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public void getPatientDetails() {
        System.out.println("\nPatient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public String getDisease() {
        return disease;
    }

    abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyCharge;
    private ArrayList<String> records = new ArrayList<>();

    public InPatient(String patientId, String name, int age, String diagnosis, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    public double calculateBill() {
        double bill = daysAdmitted * dailyCharge;
        System.out.println("In-Patient Bill: " + bill);
        return bill;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records: " + records);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private ArrayList<String> records = new ArrayList<>();

    public OutPatient(String patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        System.out.println("Out-Patient Bill: " + consultationFee);
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records: " + records);
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient patientOne = new InPatient("P1001", "Ravi", 30, "Diabetes", 5, 200);
        Patient patientTwo = new OutPatient("P2001", "Kiran", 40, "Cold", 100);

        List<Patient> patients = new ArrayList<>();
        patients.add(patientOne);
        patients.add(patientTwo);

        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Disease affected with: " + patient.getDisease());
            patient.calculateBill();
            ((MedicalRecord) patient).addRecord("Routine Checkup");
            ((MedicalRecord) patient).viewRecords();
        }
    }
}
