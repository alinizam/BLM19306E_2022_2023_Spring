/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.Observer;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        Subject subject=new Subject();
        subject.setState("Managed");
        //local class
        subject.addObserver((String state) -> {
            System.out.println("GEneric state change");
        });
        subject.addObserver(new EmployeeObserver());
        subject.addObserver(new EmployeeObserver());
        subject.addObserver(new ManagerObserver());
        subject.setState("Defined");
        
        subject.setManagerSalary("100000");
    }
}
