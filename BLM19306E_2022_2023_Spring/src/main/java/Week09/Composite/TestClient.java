/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Composite;

import Week8.Builder.Employee;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        DirectorComposite dc=new DirectorComposite();
        dc.addEmployee(new ManagerLeaf());
        dc.addEmployee(new StaffLeaf());
        dc.addEmployee(new StaffLeaf());
        dc.showSalary();
    }
}
