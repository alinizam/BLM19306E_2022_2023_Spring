/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week08.AbstactFactory;

/**
 *
 * @author ali.nizam
 */
public class Consumer {
    static IProduct produce(AbstractFactory factory){
        return factory.createProduct();
    }
}
