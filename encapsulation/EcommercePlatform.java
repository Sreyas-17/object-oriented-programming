package com.bridgelabz.encapsulation;

import java.util.ArrayList;

interface Taxable{
    double calculateTax();
    String getTaxDetails();
}
abstract class Product{
    private int productId;
    protected String productName;
    private double productPrice;
    public Product(int productId,String productName,double productPrice){
        this.productId=productId;
        this.productName=productName;
        this.productPrice=productPrice;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public double getPrice() {
        return productPrice;
    }
    public void setPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    abstract double calculateDiscount();
}
class Electronics extends Product implements Taxable{
    protected float taxPercentage=18;
    protected double totalAmount;
    public Electronics(int productId,String productName,double productPrice) {
        super(productId, productName, productPrice);
    }
    public double calculateDiscount(){
        totalAmount=getPrice()*10/100;
        return totalAmount;
    }
    public double calculateTax(){
        totalAmount=calculateDiscount()*taxPercentage/100;
        return totalAmount;
    }
    public String getTaxDetails(){
        return "Tax details are: "+taxPercentage+"%";
    }
}
class Clothing extends Product implements Taxable{
    protected float taxPercentage=15;
    protected double totalAmount;
    public Clothing(int productId,String productName,double productPrice){
        super(productId,productName,productPrice);
    }
    public double calculateDiscount(){
        totalAmount=getPrice()*7/100;
        return totalAmount;
    }
    public double calculateTax(){
        totalAmount=calculateDiscount()*taxPercentage/100;
        return totalAmount;
    }
    public String getTaxDetails(){
        return "Tax details are: "+taxPercentage+"%";
    }
}
class Groceries extends Product implements Taxable{
    protected float taxPercentage=10;
    protected double totalAmount;
    public Groceries(int productId,String productName,double productPrice){
        super(productId,productName,productPrice);
    }
    public double calculateDiscount(){
        totalAmount=getPrice()*5/100;
        return totalAmount;
    }
    public double calculateTax(){
        totalAmount=calculateDiscount()*taxPercentage/100;
        return totalAmount;
    }
    public String getTaxDetails(){
        return "Tax details are: "+taxPercentage+"%";
    }

}
public class EcommercePlatform {
    public static void main(String[] args) {
        ArrayList<Product> products=new ArrayList<>();
        products.add(new Electronics(1,"Tv",70000));
        products.add(new Clothing(2,"Shirt",1000));
        products.add(new Groceries(3,"Flour",250));
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = ((Taxable) product).calculateTax();
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("\nProduct: " + product.productName);
            System.out.println("Original Price: " + product.getPrice());
            System.out.println("Discount amount: " + discount);
            System.out.println("Tax for product: " + tax);
            System.out.println("Final Price: " + finalPrice);

            System.out.println(((Taxable) product).getTaxDetails());
        }

    }
}
