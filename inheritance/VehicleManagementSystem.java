package com.bridgelabz.inheritance;

interface Refuelable{
    public void refuel();
}

class VehicleDetails{
    private float maxSpeed;
    private String model;

    public VehicleDetails(float maxSpeed, String model){
        this.maxSpeed=maxSpeed;
        this.model=model;
    }

    public void displayDetails(){
        System.out.println("Max Speed: "+maxSpeed);
        System.out.println("Model: "+model);
    }
}

class ElectricVehicle extends VehicleDetails{
    private float chargingCapacity;

    public ElectricVehicle( float maxSpeed,String model, float chargingCapacity){
        super(maxSpeed, model);
        this.chargingCapacity=chargingCapacity;
    }

    public void charge(){
        System.out.println("Charging Capacity: "+chargingCapacity);
        System.out.println("Charging");
    }
}

class PetrolVehicle extends VehicleDetails implements Refuelable{
    private float tankCapacity;

    public PetrolVehicle(float maxSpeed, String model, float tankCapacity){
        super(maxSpeed, model);
        this.tankCapacity=tankCapacity;
    }

    public void refuel(){
        System.out.println("Tank Capacity: "+tankCapacity);
        System.out.println("Refueling");
    }
}
public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle electricVehicle=new ElectricVehicle(150, "BMW", 100);
        PetrolVehicle petrolVehicle=new PetrolVehicle(100, "Honda", 30);

        electricVehicle.displayDetails();
        electricVehicle.charge();

        petrolVehicle.displayDetails();
        petrolVehicle.refuel();
    }
}
