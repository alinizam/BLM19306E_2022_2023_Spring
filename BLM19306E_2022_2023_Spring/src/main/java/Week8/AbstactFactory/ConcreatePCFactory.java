/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week8.AbstactFactory;

/**
 *
 * @author ali.nizam
 */
public class ConcreatePCFactory implements AbstractFactory{
    int ram=4;
    @Override
    public IProduct createProduct() {
       return new PC(ram);
    }
    
}
