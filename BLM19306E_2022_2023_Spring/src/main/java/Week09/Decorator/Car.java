/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Decorator;

/**
 *
 * @author ali.nizam
 */
public class Car implements ICar{
    String model;
    int maxSpeed;

    @Override
    public void increateSpeed() {
        System.out.println("Normal car");
    }
    
}
