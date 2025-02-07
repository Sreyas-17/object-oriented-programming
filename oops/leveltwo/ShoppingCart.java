package com.bridgelabz.oops.leveltwo;

import java.util.ArrayList;

class Item {
    int idOfItem;
    String name;
    double price;
    int quantity;

    Item(int idOfItem, String name, double price, int quantity) {
        this.idOfItem = idOfItem;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
class CartItems{
    double bill = 0;
    ArrayList<Item> cartItems = new ArrayList<>();
    void addItem(int idOfItem,String name,double price,int numberOfQuantity){
        cartItems.add(new Item(idOfItem, name, price, numberOfQuantity));
    }
    void addQuantity(int idOfItem,int numberOfItems){
        for(Item item:cartItems){
            if(item.idOfItem==idOfItem){
                item.quantity+=numberOfItems;
            }
        }
    }
    void decreaseQuantity(int idOfItem,int numberOfQuantity){
        for(Item item:cartItems){
            if(item.idOfItem==idOfItem && item.quantity>=numberOfQuantity)
                item.quantity-=numberOfQuantity;
        }
    }
    void displayBill(){
        for(Item item:cartItems){
            System.out.println("\nItem details: "+item.idOfItem+" "+item.name+" "+item.price+" "+item.quantity);
            System.out.println("Amount: "+(item.price*item.quantity));
            bill+=item.price*item.quantity;
        }
    System.out.println("\nTotal bill amount is: "+bill);
    }
}

public class ShoppingCart {
    public static void main(String[] args) {

        CartItems cartItem=new CartItems();

        cartItem.addItem(1,"Chair",600,1);
        cartItem.addItem(2,"Keyboard",2000,2);
        cartItem.addItem(3,"Mouse",800,3);

        cartItem.addQuantity(1,2);
        cartItem.addQuantity(3,1);

        cartItem.decreaseQuantity(3,2);
        cartItem.decreaseQuantity(1,1);

        cartItem.displayBill();

    }
}
