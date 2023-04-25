/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Composite;

/**
 *
 * @author ali.nizam
 */
public class ManagerLeaf implements IEmployeeComponent{

    @Override
    public void showSalary() {
        System.out.println("Manager 100000");
    }
    
}
