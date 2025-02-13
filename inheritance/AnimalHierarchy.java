package com.bridgelabz.inheritance;

class Animal{
    private String name;
    private int age;

    public void makeSound(){
        System.out.println("Animal sound");
    }

}
class Dog extends Animal{

    public void makeSound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{

    public void makeSound() {
        System.out.println("Cat meows");
    }
}
class Bird extends Animal{

    public void makeSound(){
        System.out.println("Bird sound");
    }
}
public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Dog dog=new Dog();
        Cat cat=new Cat();
        Bird bird=new Bird();

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
