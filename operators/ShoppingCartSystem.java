package com.bridgelabz.operators;

import java.util.Scanner;

class Product{
    static int discount=10;
    String productName;
    double price;
    int quantity;
    final int productId;
    Product(String productName, double price, int quantity, int productId){
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
        this.productId=productId;
    }
    public static void updateDiscount(int newDiscount){
        discount=newDiscount;
    }
    public void displayProductDetails(){
        System.out.println("Product name is: "+productName);
        System.out.println("Product price is: "+price);
        System.out.println("Product quantity is: "+quantity);
        System.out.println("Product Id is: "+productId);
        System.out.println("Final price with discount "+discount+"% is: "+(price-(price*discount/100)));
    }
}
public class ShoppingCartSystem {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Product product=new Product("Car",1000000,1,107);
        System.out.println("\nThe details before updating discount: ");
        System.out.println("Is product object is instance of Product class:"+(product instanceof Product));
        product.displayProductDetails();
        System.out.println("\nEnter the new discount: ");
        int discount=scanner.nextInt();
        System.out.println("\nThe details after updating discount: ");
        Product.updateDiscount(discount);
        product.displayProductDetails();
        scanner.close();
    }
}
