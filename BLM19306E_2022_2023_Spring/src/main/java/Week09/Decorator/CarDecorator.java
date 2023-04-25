/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Decorator;

/**
 *
 * @author ali.nizam
 */
public abstract class CarDecorator implements ICar{
    ICar car;

    public CarDecorator(ICar car) {
        this.car = car;
    }
    
    @Override
    public abstract void increateSpeed();
 
}
