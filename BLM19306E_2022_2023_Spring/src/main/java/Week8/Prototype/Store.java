/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week8.Prototype;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class Store {
    static HashMap<String, Car> store=new HashMap<>();
    static{
        store.put("RedTogg", new Togg("Red"));
        store.put("BlueTogg", new Togg("Blue"));
        store.put("BMC", new Togg("White"));
    }
    static Car cloneFromStore(String colorProducer){
        try {
            return (Car)store.get(colorProducer).clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
