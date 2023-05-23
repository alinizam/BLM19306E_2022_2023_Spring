/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Example1OpenCloseSolution;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        IShape shape=new Rectangle(10, 20);
        AreaCalculator ac=new AreaCalculator();
        ac.displayArea(shape);
       
        shape=new Triangle(10, 20);
        ac.displayArea(shape);
        
    }
}
