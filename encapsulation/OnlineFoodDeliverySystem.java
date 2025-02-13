package com.bridgelabz.encapsulation;

import java.util.ArrayList;

interface  Discountable{
    void applyDiscount();
    void getDiscountDetails();
}
abstract class FoodItem {
    protected String foodName;
    private int price;
    protected int quantity;

    public FoodItem(String foodName, int price, int quantity){
        this.foodName=foodName;
        this.price=price;
        this.quantity=quantity;
    }

    public void getItemDetails(){
        System.out.println("\nFood name is: "+foodName);
        System.out.println("Food price is: "+price);
        System.out.println("Food quantity is: "+quantity);
    }

    public int getPrice(){
        return price;
    }

    abstract void calculateTotalPrice();
}
class VegItem extends FoodItem implements Discountable{
    private float discount=10;
    private double totalPrice;

    public VegItem(String foodName, int price, int quantity){
        super(foodName, price, quantity);
    }

    public void calculateTotalPrice() {
        totalPrice=getPrice()*quantity;
        System.out.println("Additional charges: "+0);
        System.out.println("Total price of the food before discount is: "+totalPrice);
    }

    @Override
    public void applyDiscount() {
        double discountPrice=totalPrice-(totalPrice*discount/100);
        System.out.println("After discount applied on the food, price is: "+discountPrice);
    }
    @Override
    public void getDiscountDetails() {
        System.out.println("Discount applied on the food is: "+discount+"%");
    }
}
class NonVegItem extends FoodItem implements Discountable{
    private double additionalCharges=70;
    private float discount=8;
    private double totalPrice;

    public NonVegItem(String foodName, int price, int quantity){
        super(foodName, price, quantity);
    }

    public void calculateTotalPrice() {
        totalPrice=getPrice()*quantity+additionalCharges;
        System.out.println("Additional charges: "+additionalCharges);
        System.out.println("Total price of the food before discount is: "+totalPrice);
    }

    @Override
    public void applyDiscount(){
        double discountPrice=totalPrice-(totalPrice*discount/100);
        System.out.println("After discount applied on the food, price is: "+discountPrice);
    }

    @Override
    public void getDiscountDetails(){
        System.out.println("Discount applied on the food is: "+discount+"%");
    }
}
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        ArrayList<FoodItem> foodItems=new ArrayList<>();
        foodItems.add(new VegItem("Paneer", 100, 2));
        foodItems.add(new NonVegItem("Chicken", 200, 3));

        for(FoodItem foodItem:foodItems) {
            foodItem.getItemDetails();
            foodItem.calculateTotalPrice();
            ((Discountable) foodItem).getDiscountDetails();
            ((Discountable) foodItem).applyDiscount();
        }
    }
}