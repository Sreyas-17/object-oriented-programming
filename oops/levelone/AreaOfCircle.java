package com.bridgelabz.oops.levelone;

import java.util.Scanner;
class Circle{
    int radius;
    public void displayResults(){
        float area=3.14f*radius*radius;
        float circumference=2*3.14f*radius;
        System.out.println("The area of the circle is "+area);
        System.out.println("The circumference of the circle is "+circumference);
    }
}
public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle: ");
        Scanner scanner=new Scanner(System.in);
        int radius=scanner.nextInt();
        Circle circle=new Circle();
        circle.radius=radius;
        circle.displayResults();
        scanner.close();
    }
}