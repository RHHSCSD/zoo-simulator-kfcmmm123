/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;

/**
 *
 * @author michael.roy-diclemen
 */
public class ZooSim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a zoo
        Zoo zoo = new Zoo();

        // Sample images for animals (assuming you have an Image constructor)
        Image lionImage = new Image(100, 200);
        Image eagleImage = new Image(50, 100);
        Image fishImage = new Image(30, 60);

        // Create some animals
        LandAnim lion = new LandAnim("Leo", "Lion", 'M', 5, 2, 3, lionImage, "Roar");
        BirdAnim eagle = new BirdAnim("Eddie", "Eagle", 'F', 4, 1, 5, eagleImage, "Screech", true);
        WaterAnim fish = new WaterAnim("Nemo", "Fish", 'M', 1, 1, 2, fishImage, "Blub", true);

        // Add animals to the zoo
        zoo.addAnimal(lion);
        zoo.addAnimal(eagle);
        zoo.addAnimal(fish);

        // Display Zoo Statistics
        zoo.displayZooStatistics();

        fish.swim();
        fish.printHunger();
        
        lion.makeSound(); 
        zoo.feedAllHungryAnimals();
        fish.printHunger();

        eagle.fly(); 
        eagle.printHunger();
        eagle.eat();
        eagle.printHunger();
        
        eagle.printFatigue();
        zoo.makeAllTiredAnimalsSleep();
        eagle.printFatigue();

        // Move all animals
        zoo.moveAllAnimals();
        lion.turn(90);
        lion.move();
    }
    
}
