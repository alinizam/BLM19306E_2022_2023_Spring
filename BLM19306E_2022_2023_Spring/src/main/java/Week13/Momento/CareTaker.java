/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.Momento;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class CareTaker {
    ArrayList<Momento> states=new ArrayList<>();
    void saveState(Momento m){
        states.add(m);
    }
    Momento getState(int index){
        return states.get(index);    
    }
    
    
}
