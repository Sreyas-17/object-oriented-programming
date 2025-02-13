package com.bridgelabz.inheritance;

class Device{
    private int deviceId;
    private String status;

    public Device(int deviceId, String status){
        this.deviceId=deviceId;
        this.status=status;
    }

    public int getDeviceId(){
        return deviceId;
    }

    public String getStatus(){
        return status;
    }

    public void setDeviceId(int deviceId){
        this.deviceId=deviceId;
    }

    public void setStatus(String status){
        this.status=status;
    }
}
class Thermostat extends Device{
    private int temperatureSetting;

    public Thermostat(int deviceId,String status, int temperatureSetting){
        super(deviceId, status);
        this.temperatureSetting=temperatureSetting;
    }

    public void displayDetails(){
        System.out.println("Device Id: "+getDeviceId());
        System.out.println("Status: "+getStatus());
        System.out.println("Temperature Setting: "+temperatureSetting);
    }
}
public class SmartHomeDevices {
    public static void main(String[] args) {
        Thermostat thermostat=new Thermostat(1, "on", 25);
        thermostat.displayDetails();
    }
}
