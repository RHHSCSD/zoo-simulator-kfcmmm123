/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author alan
 */
public class WaterAnim extends Animal implements ISwimmable {
    private boolean canBreathe;

    public WaterAnim(String name, String species, char sex, int age, int size, int speed, Image image, String sound, boolean canBreathe) {
        super(name, species, sex, age, size, speed, image, sound);
        this.canBreathe = canBreathe;
    }

    public void swim() {
        // Implementation of swim method
        if (canBreathe) {
            System.out.println(name + " is swimming.");
        } else {
            System.out.println(name + " cannot swim.");
        }
    }

    @Override
    public boolean canSurface() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
