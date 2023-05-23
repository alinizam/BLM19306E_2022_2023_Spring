/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.Observer;

/**
 *
 * @author ali.nizam
 */
public class EmployeeObserver implements IObserver{

    @Override
    public void update(String state) {
        System.out.println("State related with Employee is changed");
    }
    
}
