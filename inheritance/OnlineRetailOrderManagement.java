package com.bridgelabz.inheritance;

class Order{
 private int orderId;
 private String orderDate;

 public Order(int orderId, String orderDate){
     this.orderId=orderId;
     this.orderDate=orderDate;
 }

 public int getOrderId(){
     return orderId;
 }

 public String getOrderDate(){
     return orderDate;
 }

 public void setOrderId(int orderId){
     this.orderId=orderId;
 }

 public void setOrderDate(String orderDate){
     this.orderDate=orderDate;

 }
}
class ShippedOrder extends Order{
    private double trackingNumber;

    public ShippedOrder(int orderId, String orderDate, double trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber=trackingNumber;
    }

    public double getTrackingNumber(){
        return trackingNumber;
    }

    public void setTrackingNumber(double trackingNumber){
        this.trackingNumber=trackingNumber;
    }
}
class DeliveredOrder extends ShippedOrder{
    private String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, double trackingNumber, String deliveryDate){
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate=deliveryDate;
    }

    public void displayDetails(){
        System.out.println("Order Id: "+getOrderId());
        System.out.println("Order Date: "+getOrderDate());
        System.out.println("Tracking Number: "+getTrackingNumber());
        System.out.println("Delivery Date: "+deliveryDate);
    }

}
public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        DeliveredOrder deliveredOrder=new DeliveredOrder(1, "08-01-2025", 123456789, "12-01-2026");
        deliveredOrder.displayDetails();
    }
}
