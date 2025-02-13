package com.bridgelabz.inheritance;

class Vehicle{
    private float maxSpeed;
    private String fuelType;

    public Vehicle(float maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }

    public void displayInfo(){
        System.out.println("Max speed is: "+maxSpeed);
        System.out.println("Fuel type is: "+fuelType);
    }
}
class Car extends Vehicle{
    private int seatCapacity;

    public Car(float maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity=seatCapacity;
    }

    public void displayInfo(){
        System.out.println("Car Details:");
        super.displayInfo();
        System.out.println("Seat Capacity is: "+seatCapacity);
    }
}
class Truck extends Vehicle{
    private float tankCapacity;
    public Truck(float maxSpeed,String fuelType,float tankCapacity){
        super(maxSpeed, fuelType);
        this.tankCapacity=tankCapacity;
    }
    public void displayInfo(){
        System.out.println("\nTruck Details:");
        super.displayInfo();
        System.out.println("Tank Capacity is: "+tankCapacity);
    }
}
class Motorcycle extends Vehicle{
    private float mileage;
    public Motorcycle(float maxSpeed,String fuelType,float mileage){
        super(maxSpeed, fuelType);
        this.mileage=mileage;
    }
    public void displayInfo(){
        System.out.println("\nMotorcycle Details:");
        super.displayInfo();
        System.out.println("Mileage is: "+mileage);
    }
}
public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        Vehicle car=new Car(150, "Petrol", 4);
        Vehicle truck=new Truck(100, "Petrol", 60);
        Vehicle motorcycle=new Motorcycle(50, "Petrol", 50);
        car.displayInfo();
        truck.displayInfo();
        motorcycle.displayInfo();
    }
}
