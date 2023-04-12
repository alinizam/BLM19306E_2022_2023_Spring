/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7.Example1OpenCloseSolution;

/**
 *
 * @author ali.nizam
 */
public class Triangle implements IShape{
    double height,weight;

    public Triangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    
    @Override
    public double getArea() {
        return height*weight/2;
    }
}
