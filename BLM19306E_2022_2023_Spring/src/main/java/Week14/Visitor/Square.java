/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14.Visitor;

/**
 *
 * @author ali.nizam
 */
public class Square implements IShape{
    int edge;

    public Square(int edge) {
        this.edge = edge;
    }
    

    @Override
    public void accept(IVisitor v) {
        v.visit(this);
    }

   
    
}
