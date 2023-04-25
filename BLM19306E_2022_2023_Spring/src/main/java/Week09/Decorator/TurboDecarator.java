/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Decorator;

/**
 *
 * @author ali.nizam
 */
public class TurboDecarator extends CarDecorator{

    public TurboDecarator(ICar car) {
        super(car);
    }

    @Override
    public void increateSpeed() {
        car.increateSpeed();
        turboSpeed();
    }
    void turboSpeed(){
        System.out.println("Turbo works");
    }
    
}
