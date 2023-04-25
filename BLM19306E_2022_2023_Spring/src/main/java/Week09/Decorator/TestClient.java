/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Decorator;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        ICar car=new Sedan();
        car.increateSpeed();
        System.out.println("----------------"); 
        ICar improvedSedan=new TurboDecarator(car);
        improvedSedan.increateSpeed();
        
    }
}
