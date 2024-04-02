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

    /**
     * 
     */
    public int id;

    /**
     *
     */
    public String name;

    /**
     *
     */
    public String species;

    /**
     *
     */
    public char sex;

    /**
     *
     */
    public int age;

    /**
     *
     */
    public int positionX;

    /**
     *
     */
    public int positionY;

    /**
     *
     */
    public int size;

    /**
     *
     */
    public int speed;

    /**
     *
     */
    public double direction;

    /**
     *
     */
    public int hunger;

    /**
     *
     */
    public int fatigue;

    /**
     *
     */
    public Image image;

    /**
     *
     */
    public String sound;
    
    /**
     *Animal's constructor
     * @param name
     * @param species
     * @param sex
     * @param age
     * @param size
     * @param speed
     * @param image
     * @param sound
     */
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

    /**
     * move the animal 
     */
    public void move() {
        //check if the animal can move 
        if (this.fatigue < 5 && this.hunger < 5){
            
            //get the direction in radian
            double radian = Math.toRadians(direction);
            
            //move the animal to the direction with its speed 
            this.positionX += (int)(Math.cos(radian)*speed);
            this.positionY += (int)(Math.sin(radian)*speed);
            
            //add fatigue and hunger after moving
            this.fatigue ++;
            this.hunger ++;
        }
        else{
            System.out.println( this.name + " cannot move now.");
        }
    }

    /**
     * let the animal to make sound 
     */
    public void makeSound() {
        System.out.println(name + " makes a sound: " + sound);
    }

    /**
     * feed the animal and set the hunger 0
     */
    public void eat() {
        hunger = 0; 
        System.out.println(name + " eats and feels less hungry.");
    }

    /**
     * let the animal sleep and set the fatigue 0
     */
    public void sleep() {
        fatigue = 0; 
        System.out.println(name + " sleeps and feels less tired.");
    }

    /**
     * turn the animal to that direction
     * @param degrees
     */
    public void turn(int degrees) {
        direction = degrees;
        System.out.println(name + " turns to " + degrees + " degrees.");
    }

    /**
     * place the animal at that coordinate
     * @param x
     * @param y
     */
    public void place(int x, int y) {
        positionX = x;
        positionY = y;
        System.out.println(name + " is placed at position (" + x + ", " + y + ").");
    }

    /**
     * get the name of the animal
     * @return
     */
    public String getName(){
        return this.name;
    }

    /**
     * get the hunger of the animal
     * @return
     */
    public int getHunger(){
        return this.hunger;
    }

    /**
     * output the name of the animal
     */
    public void printHunger(){
        System.out.println(this.name + "'s hunger is " + this.hunger);
    }

    /**
     * get the fatigue of the animal
     * @return
     */
    public int getFatigue(){
        return this.fatigue;
    }

    /**
     * output the name of the animal
     */
    public void printFatigue(){
        System.out.println(this.name + "'s fatigue is " + this.fatigue);
    }
}
