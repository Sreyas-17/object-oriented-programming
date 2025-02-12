package com.bridgelabz.objectModelling;

import java.util.ArrayList;
//Customer class
class CustomerOrder {
    String customerName;
    ArrayList<Order> Orders;
    CustomerOrder(String customerName){
        this.customerName=customerName;
        Orders=new ArrayList<>();
    }
    //To add orders of specific customers
    void addOrder(Order order){
        Orders.add(order);
    }
    //Display order details
    void getCustomerOrders(){
        System.out.println("\nCustomer name: "+customerName);
        for(Order order:Orders){
            order.getOrderDetails();
        }
    }
}
//Order class
class Order {
    int orderID;
    ArrayList<Product> products;
    Order(int orderID){
        this.orderID=orderID;
        products=new ArrayList<>();
    }
    //Add products to the order
    void addProduct(Product product){
        products.add(product);
    }
    //Display the order details
    void getOrderDetails(){
        double totalCost=0;
        System.out.println("Order ID: "+orderID);
        for(Product product:products){
            System.out.println("Product name: "+product.productName+" - "+product.price);
            totalCost+=product.price;
        }
        System.out.println("Total cost: "+totalCost);
    }
}
//Product class
class Product {
    String productName;
    double price;
    Product(String productName, double price){
        this.productName=productName;
        this.price=price;
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        CustomerOrder customer1 = new CustomerOrder("Ravi");
        CustomerOrder customer2 = new CustomerOrder("Suresh");

        // Create Products objects
        Product product1 = new Product("Laptop", 800.0);
        Product product2 = new Product("Headphones", 50.0);
        Product product3 = new Product("Phone", 500.0);

        // Create Orders objects
        Order order1 = new Order(101);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order(102);
        order2.addProduct(product3);

        // Add Orders to Customers
        customer1.addOrder(order1);
        customer2.addOrder(order2);

        // Display Customer Orders
        customer1.getCustomerOrders();
        customer2.getCustomerOrders();
    }
}
