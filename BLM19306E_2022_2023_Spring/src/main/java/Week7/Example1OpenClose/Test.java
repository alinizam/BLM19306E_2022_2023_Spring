/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7.Example1OpenClose;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        AreaCalculator area=new AreaCalculator();
        Shape s=new Rectangle();
        s.height=10;
        s.width=20;
        System.out.println(area.getArea(s));
        s=new Triangle();
        s.height=10;
        s.width=20;
        System.out.println(area.getArea(s));
    }
}
