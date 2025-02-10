package com.bridgelabz.constructors;
import java.util.Scanner;
class Circle{
    int radius;
    Circle(){
        radius=10;
    }
    Circle(int radius){
        this.radius=radius;
    }
    public void displayResults(){

        System.out.println("The radius of circle is: "+radius);
    }
}

public class CircleRadius {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle: ");
        Scanner scanner=new Scanner(System.in);
        int radius=scanner.nextInt();
        Circle circleDefault=new Circle();
        Circle circleParametrized=new Circle(radius);
        System.out.println("\nThe radius declared using default constructor: ");
        circleDefault.displayResults();
        System.out.println("\nThe radius declared using parameterized constructor: ");
        circleParametrized.displayResults();
        scanner.close();
    }
}
