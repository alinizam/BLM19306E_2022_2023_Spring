/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Example1OpenClose;

/**
 *
 * @author ali.nizam
 */
public class AreaCalculator {
    public double getArea(Shape  shape) {
        double area = 0;

        if (shape instanceof Rectangle) {
            area = shape.width*shape.height;
        }else if (shape instanceof Triangle)  {
            area = (shape.width*shape.height)/2;
        }else if (shape instanceof Circle)  {
            area = (shape.width*Math.PI)*2;
        }
        return area;
    }
    
}


