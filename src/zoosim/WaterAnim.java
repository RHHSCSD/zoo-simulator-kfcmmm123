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
    private boolean canSurface;

    public WaterAnim(String name, String species, char sex, int age, int size, int speed, Image image, String sound, boolean canBreathe) {
        super(name, species, sex, age, size, speed, image, sound);
        this.canBreathe = canBreathe;
    }

    public void swim() {
        // Implementation of swim method
        if (canBreathe) {
            System.out.println(name + " is swimming.");
            this.hunger+= 4;
            this.fatigue+= 4;
        } else {
            System.out.println(name + " cannot swim.");
        }
    }

    @Override
    public boolean canSurface() {
        return canSurface;
    }
}
