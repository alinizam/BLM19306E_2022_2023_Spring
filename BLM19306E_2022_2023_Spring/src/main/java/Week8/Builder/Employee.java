/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week8.Builder;

/**
 *
 * @author ali.nizam
 */
public class Employee {
    String firstName,lastName;
    int salary;

    public Employee(Builder b) {
        firstName=b.firstName;
        lastName=b.lastName;
        salary=b.salary;
    }
    
    

    /*public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    
    public Employee(String firstName,  int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        
    }
    
    public Employee(int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }*/
    
    static class Builder{
        String firstName,lastName;
        int salary;
        Builder setFirstName(String firstName){
            this.firstName=firstName;
            return this;
        }
        
        Builder setLastName(String lastName){
            this.lastName=lastName;
            return this;
        }
        
        Builder setSalary(int salary){
            this.salary=salary;
            return this;
        }
        
        Employee build(){
            Employee e=new Employee(this);
            return e;
        }
    
    }
}
