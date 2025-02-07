package com.bridgelabz.oops.levelone;

import java.util.Scanner;
class MobilePhone {
    String brandName;
    String model;
    int price;
    public void displayDetails(){
        System.out.println("Brand Name: "+brandName);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }
}
public class MobilePhoneDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the brand name,model and price of mobile: ");
        String brandName = input.nextLine();
        String model = input.nextLine();
        int price = input.nextInt();
        MobilePhone mobile=new MobilePhone();
        mobile.brandName=brandName;
        mobile.model=model;
        mobile.price=price;
        mobile.displayDetails();
    }
}
