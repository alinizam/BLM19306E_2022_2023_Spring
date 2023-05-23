/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.Observer;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Subject implements ISubject{
    ArrayList<IObserver> observers=new ArrayList<>();
    String state;
    @Override
    public void addObserver(IObserver o) {
        observers.add(o);
    }

    public void setState(String state) {
        this.state = state;
        notifyObserver();
    }
    
     public void setManagerSalary(String state) {
        this.state = state;
        notifyManagerObserver();
    }
    
    

    @Override
    public void notifyObserver() {
        for (IObserver observer : observers) {
            observer.update(state);
        }
    }
    
    
    public void notifyManagerObserver() {
        for (IObserver observer : observers) {
            if (observer instanceof ManagerObserver)
                    observer.update(state);
        }
    }
    
}
