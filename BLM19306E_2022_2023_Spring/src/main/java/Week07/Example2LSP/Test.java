/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Example2LSP;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Car c=new Togg();
        c.increaseSpeed();
        (new Togg()).openAirCondition();
        
        Car t1=new Toros();
        t1.increaseSpeed();
        
    }
}
