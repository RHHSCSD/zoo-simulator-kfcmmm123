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

/**
 *
 * @author alan
 */
public class Zoo {
    private ArrayList<Animal> animals;

    /**
     *
     */
    public Zoo() {
        animals = new ArrayList<>();
    }

    /**
     *
     * @param animal
     */
    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " has been added to the zoo.");
    }

    /**
     *
     */
    public void displayZooStatistics() {
        System.out.println("Zoo Statistics:");
        System.out.println("Total animals: " + animals.size());
    }

    /**
     *
     */
    public void feedAllHungryAnimals() {
        for (Animal animal : animals) {
            animal.eat();
        }
        System.out.println("All animals are fed and their hunger is 0 now.");

    }

    /**
     *
     */
    public void makeAllTiredAnimalsSleep() {
        for (Animal animal : animals) {
            animal.sleep();
        }
        System.out.println("All animals had a nice sleep and their fatigue is 0 now.");
    }

    /**
     *
     */
    public void moveAllAnimals() {
        for (Animal animal : animals) {
            animal.move();
        }
    }
}
