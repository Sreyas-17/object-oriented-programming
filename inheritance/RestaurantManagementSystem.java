package com.bridgelabz.inheritance;
interface Worker{
    public void performDuties();
}
class PersonDetails{
    private String name;
    private int id;

    public PersonDetails(String name, int id){
        this.name=name;
        this.id=id;
    }

    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
    }
}
class Chef extends PersonDetails implements Worker{
    private String cuisine;

    public Chef(String name, int id, String cuisine){
        super(name, id);
        this.cuisine=cuisine;
    }

    public void performDuties(){
        System.out.println("Speciality "+cuisine+" dishes.");
    }
}
class Waiter extends PersonDetails implements Worker{
    private int experience;

    public Waiter(String name,int id,int experience){
        super(name, id);
        this.experience=experience;
    }

    public void performDuties(){
        System.out.println("Waiter: "+experience+" years experience.");
    }

}
public class RestaurantManagementSystem {
    public static void main(String[] args){
        Chef chef=new Chef("Suresh", 1002, "Indian");
        chef.performDuties();
        chef.displayDetails();

        Waiter waiter=new Waiter("Harry", 1001, 2);
        waiter.performDuties();
        waiter.displayDetails();
    }
}
