/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7.Example6IOC;

/**
 *
 * @author ali.nizam
 */
public class Calculator {
    void callOperaration(IOperation operation,int a, int b){
        System.out.println(operation.calculate(a, b));
    }
}
