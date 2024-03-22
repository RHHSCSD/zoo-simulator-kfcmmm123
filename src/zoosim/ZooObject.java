/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author alan
 */
public class ZooObject implements IObject{
    private String type;
    private int positionX;
    private int positionY;
    private int size;
    public ZooObject(String type, int positionX, int positionY, int size) {
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
        this.size = size;
    }
    @Override
    public void turn(int degrees) {
        // Static objects like food, rock, and tree usually don't turn but implementing method to satisfy interface requirement
        System.out.println("This object (" + type + ") doesn't turn.");
    }

    @Override
    public void place(int x, int y) {
        this.positionX = x;
        this.positionY = y;
        System.out.println("Placed " + type + " at (" + x + ", " + y + ").");
    }
}
