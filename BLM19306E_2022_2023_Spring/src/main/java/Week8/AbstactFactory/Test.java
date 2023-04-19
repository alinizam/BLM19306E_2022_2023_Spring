/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week8.AbstactFactory;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory aFactory=new ConcreteCarFactory("Togg");
        System.out.println(aFactory.createProduct());
        aFactory=new ConcreatePCFactory();
        System.out.println(aFactory.createProduct());  
        
        System.out.println("----------------");
        System.out.println(Consumer.produce(new ConcreteCarFactory("Togg")));
        System.out.println(Consumer.produce(new ConcreatePCFactory()));
    }
}
