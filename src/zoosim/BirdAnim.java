/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author alan
 */
public class BirdAnim extends Animal implements IFlyable {
    private boolean canFly;
    private boolean isFlying;

    /**
     *
     * @param name
     * @param species
     * @param sex
     * @param age
     * @param size
     * @param speed
     * @param image
     * @param sound
     * @param canFly
     */
    public BirdAnim(String name, String species, char sex, int age, int size, int speed, Image image, String sound, boolean canFly) {
        super(name, species, sex, age, size, speed, image, sound);
        this.canFly = canFly;
    }
    
    /**
     *
     */
    @Override
    public void fly() {
        // Implementation of fly method
        if (canFly && !isFlying) {
            System.out.println(name + " is flying.");
            this.hunger += 3;
            this.fatigue += 3;
        } else if (canFly && isFlying){
            System.out.println(name + " is already flying.");
        }else {
            System.out.println(name + " cannot fly.");
        }    
    }

    /**
     *
     */
    @Override
    public void land() {
        if (canFly && isFlying) {
            System.out.println(name + " has landed.");
        } else if (canFly && !isFlying){
            System.out.println(name + " is not flying.");
        }
        else {
            System.out.println(name + "cannot fly");
        }
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isFlying() {
        return isFlying;
    }
    

}
