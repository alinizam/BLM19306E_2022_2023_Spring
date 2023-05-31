/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14.Strategy;

/**
 *
 * @author ali.nizam
 */
public class CalculatorContext {
    IOperation operation;

    public void setOperation(IOperation operation) {
        this.operation = operation;
    }

    public CalculatorContext(IOperation operation) {
        this.operation = operation;
    }
    
    int doOperation(int a,int b){
        return operation.calculate(a, b);
    }
    int doOperation(IOperation operation,int a,int b){
        this.operation = operation;
        return operation.calculate(a, b);
    }
    
}
