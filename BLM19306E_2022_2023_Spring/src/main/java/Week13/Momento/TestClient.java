/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.Momento;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        Originator o=new Originator();
        o.setState("1");
        CareTaker store=new CareTaker();
        o.saveState(store);
        
        o.setState("2");
        o.saveState(store);
        //not saved state
        o.setState("3");
        o.setState("4");
        
        o.saveState(store); 
        System.out.println(o.readSavedState(store, 1));
        o.setSavedState(store,0); 
        
        System.out.println("Returned to the " +o.getState());    
    }
}
