/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.Momento;

/**
 *
 * @author ali.nizam
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
    
    void saveState(CareTaker c){
        c.saveState(new Momento(state));
    }
    
    String readSavedState(CareTaker c,int i){
        return (c.getState(i)).state;
    }
    
    void setSavedState(CareTaker c,int i){
        state=(c.getState(i)).state;
    }
    
 
    
}
