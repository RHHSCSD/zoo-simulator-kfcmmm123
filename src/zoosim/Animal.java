/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author alan
 */
public class Animal {
    public int id;
    public String name;
    public String species;
    public char sex;
    public int age;
    public int positionX;
    public int positionY;
    public int size;
    public int speed;
    public double direction;
    public int hunger;
    public int fatigue;
    public Image image;
    public String sound;
    
    public Animal(String name, String species, char sex, int age, int size, int speed, Image image, String sound) {
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.age = age;
        this.size = size;
        this.speed = speed;
        this.image = image;
        this.sound = sound;
        this.positionX = 0; // default position
        this.positionY = 0;
        this.direction = 0; // default direction
        this.hunger = 0; // default hunger
        this.fatigue = 0; // default fatigue
    }

    
    public void move() {
        System.out.println(name + " is moving at speed " + speed + " in direction " + direction);
    }

    public void makeSound() {
        System.out.println(name + " makes a sound: " + sound);
    }

    public void eat() {
        hunger = 0; 
        System.out.println(name + " eats and feels less hungry.");
    }

    public void sleep() {
        fatigue = 0; 
        System.out.println(name + " sleeps and feels less tired.");
    }

    public void turn(int degrees) {
        direction += degrees;
        System.out.println(name + " turns " + degrees + " degrees.");
    }
    public void place(int x, int y) {
        positionX = x;
        positionY = y;
        System.out.println(name + " is placed at position (" + x + ", " + y + ").");
    }
    public String getName(){
        return this.name;
    }
    public int getHunger(){
        return this.hunger;
    }
    public void printHunger(){
        System.out.println(this.name + "'s hunger is " + this.hunger);
    }
    public int getFatigue(){
        return this.fatigue;
    }
    public void printFatigue(){
        System.out.println(this.name + "'s fatigue is " + this.fatigue);
    }
}
