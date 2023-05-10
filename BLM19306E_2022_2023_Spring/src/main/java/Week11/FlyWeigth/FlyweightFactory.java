/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.FlyWeigth;

import java.util.HashMap;

/**
 *
 * @author ali.nizam
 */
public class FlyweightFactory {
    static HashMap<String, IShape> store=new HashMap<>();
    static int getObjectNumber(){
        return store.size();
    }
    
    static IShape getColorObject(String color){
        IShape o=store.get(color);
        if (o==null){
            o=new Circle(color);
            store.put(color,o );
        }
        return o;
    }
}
