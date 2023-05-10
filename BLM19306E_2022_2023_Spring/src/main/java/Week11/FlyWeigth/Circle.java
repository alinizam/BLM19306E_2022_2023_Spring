/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.FlyWeigth;

/**
 *
 * @author ali.nizam
 */
public class Circle implements IShape{
    String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void getColor() {
        System.out.println(color);
    }
    
}
