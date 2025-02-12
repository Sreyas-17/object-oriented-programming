package com.bridgelabz.objectModelling;

import java.util.ArrayList;

//Hospital class, it stores doctor details in specific hospital
class Hospital{
    String hospitalName;
    ArrayList<Doctor> doctors;
    Hospital(String hospitalName){
        this.hospitalName=hospitalName;
        doctors=new ArrayList<>();
    }
    //To add doctors in the hospital
    void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }
    //Display which doctors working in the hospital
    void displayDoctorsInHospital(){
        System.out.println("Doctors in "+hospitalName+" are:");
        for(Doctor doctor:doctors){
            System.out.println(doctor.getDoctorName()+" - "+doctor.getSpecialization());
        }
    }
}
//Doctor class
class Doctor{
    String doctorName;
    String specialization;
    ArrayList<Patient> patients;
    Doctor(String doctorName, String specialization){
        this.doctorName=doctorName;
        this.specialization=specialization;
        patients=new ArrayList<>();
    }
    //Assign patients to doctors
    void addPatient(Patient patient){
        patients.add(patient);
        patient.addDoctor(this);

    }
    String getDoctorName(){
        return doctorName;
    }
    String getSpecialization(){
        return specialization;
    }
    //Show which patients are assigned to each doctor
    void displayPatients(){
        System.out.println("\nPatients under "+doctorName+" are:");
        for(Patient patient:patients){
            System.out.println(patient.getPatientName()+" affected with "+patient.getDisease());
        }
    }
}
//patient class
class Patient{
    String patientName;
    String disease;
    ArrayList<Doctor> doctors;
    Patient(String patientName,String disease){
        this.patientName=patientName;
        this.disease=disease;
        doctors=new ArrayList<>();
    }
    //To assign patient to a doctor
    void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }
    String getPatientName(){
        return patientName;
    }
    String getDisease(){
        return disease;
    }
    //Display doctors who are assigned to the patient
    void displayDoctors(){
        System.out.println("\nDoctors assigned to "+patientName+" are:");
        for(Doctor doctor:doctors){
            System.out.println(doctor.getDoctorName());
        }
    }
}
public class HospitalManagement {
    public static void main(String[] args) {
        //Creating hospital object
        Hospital hospitalOne=new Hospital("AIMS");
        //Creating doctor objects
        Doctor doctorOne=new Doctor("Manish", "General Medicine");
        Doctor doctorTwo=new Doctor("Kuladeep", "Dermatologist");
        //Creating patient objects
        Patient patientOne=new Patient("Ravi", "Cough");
        Patient patientTwo=new Patient("John", "Cold");
        Patient patientThree=new Patient("Henry", "Fever");
        Patient patientFour=new Patient("John", "Rashes");
        //Adding doctors to hospital
        hospitalOne.addDoctor(doctorOne);
        hospitalOne.addDoctor(doctorTwo);
        //Assigning patients to doctors
        doctorOne.addPatient(patientOne);
        doctorOne.addPatient(patientTwo);
        doctorTwo.addPatient(patientThree);
        doctorTwo.addPatient(patientFour);
        //Display which doctors are working in which hospital
        hospitalOne.displayDoctorsInHospital();
        //Showing doctors assigned to the patient
        patientOne.displayDoctors();
        patientTwo.displayDoctors();
        patientThree.displayDoctors();
        patientFour.displayDoctors();
        //Showing patients under the doctor
        doctorOne.displayPatients();
        doctorTwo.displayPatients();
    }
}