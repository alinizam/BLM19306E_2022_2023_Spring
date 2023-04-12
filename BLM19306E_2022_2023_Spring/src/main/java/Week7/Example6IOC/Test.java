/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7.Example6IOC;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.callOperaration(new AddOperation(), 10, 4);
        c.callOperaration(new SubtractOperation(), 10, 4);
    }
}
