/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Example2LSPSolution;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Car c=new Togg();
        c.increaseSpeed();
        c.openAirCondition();
        
        Car t1=new Toros();
        t1.increaseSpeed();
        //Bad solution
        if (t1 instanceof Toros==false) 
            t1.openAirCondition();
    }
}
