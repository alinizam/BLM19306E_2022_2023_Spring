/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Example3LSP;

/**
 *
 * @author ali.nizam
 */
public class Rectangle  {
    double height,weight;

    public Rectangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    double getArea(){
    
        return height*weight;
    }
    
    
}