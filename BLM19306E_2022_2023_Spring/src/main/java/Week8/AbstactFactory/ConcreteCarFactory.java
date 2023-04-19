/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week8.AbstactFactory;

/**
 *
 * @author ali.nizam
 */
public class ConcreteCarFactory implements AbstractFactory{
    String model;

    public ConcreteCarFactory(String model) {
        this.model = model;
    }
    
    @Override
    public IProduct createProduct() {
        if (model=="Togg"){
            /*do something*/
            return new Togg();
        }else if(model=="BMC"){
            return new BMC();
        }else{
            return new Car();
        }
    }
    
}
