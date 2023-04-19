/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week8.Prototype;

/**
 *
 * @author ali.nizam
 */
public class Car implements Cloneable{
    String color;

    public Car(String color) {
        this.color = color;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
    
}
