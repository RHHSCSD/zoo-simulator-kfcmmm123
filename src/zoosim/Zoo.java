package zoosim;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alan
 */
import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " has been added to the zoo.");
    }

    public void displayZooStatistics() {
        System.out.println("Zoo Statistics:");
        System.out.println("Total animals: " + animals.size());
        // Additional statistics can be added here
    }

    public void feedAllHungryAnimals() {
        for (Animal animal : animals) {
            if (animal.getHunger() > 5) { // Assuming hunger is measured on a scale, adjust as necessary
                animal.eat();
            }
        }
    }

    public void makeAllTiredAnimalsSleep() {
        for (Animal animal : animals) {
            if (animal.getFatigue() > 5) { // Assuming fatigue is measured on a scale, adjust as necessary
                animal.sleep();
            }
        }
    }

    public void moveAllAnimals() {
        for (Animal animal : animals) {
            animal.move();
        }
    }
}
