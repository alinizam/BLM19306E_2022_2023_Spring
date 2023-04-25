/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Composite;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class DirectorComposite implements IEmployeeComponent{
    ArrayList<IEmployeeComponent> employees=new ArrayList<>();
    void addEmployee(IEmployeeComponent e){
        employees.add(e);
    }

    @Override
    public void showSalary() {
        for (IEmployeeComponent employee : employees) {
            employee.showSalary();
        }
    }
    
    void removeEmployee(IEmployeeComponent e){
        employees.remove(e);
    }
    
    
    
    
}
