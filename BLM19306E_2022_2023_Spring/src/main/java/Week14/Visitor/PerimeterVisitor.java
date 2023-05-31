/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14.Visitor;

/**
 *
 * @author ali.nizam
 */
public class PerimeterVisitor implements IVisitor{

    @Override
    public void visit(Square s) {
        System.out.println(s.edge*4);
    }
    
}
