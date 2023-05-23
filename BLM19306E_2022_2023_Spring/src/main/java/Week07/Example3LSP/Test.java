/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Example3LSP;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Rectangle r=new Square(10);
        System.out.println(r.getArea());
    }
}
