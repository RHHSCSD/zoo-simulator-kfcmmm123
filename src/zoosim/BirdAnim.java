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

    public BirdAnim(String name, String species, char sex, int age, int size, int speed, Image image, String sound, boolean canFly) {
        super(name, species, sex, age, size, speed, image, sound);
        this.canFly = canFly;
    }
    
    @Override
    public void fly() {
        // Implementation of fly method
        if (canFly) {
            System.out.println(name + " is flying.");
            this.hunger -=1;
            this.fatigue -=1;
        } else {
            System.out.println(name + " cannot fly.");
        }
    }

    @Override
    public void land() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isFlying() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
