/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06;

/**
 *
 * @author ali.nizam
 */
public class Employee {
    
    Payment[] p;
    int salary;
    void A(){
        Payment p=new Payment();
    }
    
    void calculatePayment(IPayment p){
    
    }
    private class Payment implements IPayment{
       int salary(){
           return salary;
       }

        @Override
        public int calculateSalary() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public int setPayment(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
