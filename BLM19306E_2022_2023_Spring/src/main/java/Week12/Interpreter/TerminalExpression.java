/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.Interpreter;

/**
 *
 * @author ali.nizam
 */
public class TerminalExpression implements IExpression{
    String context;

    public TerminalExpression(String context) {
        this.context = context;
    }

    public TerminalExpression() {
    }
    

    @Override
    public boolean interprate(String context) {
        return Character.isDigit(context.charAt(0));
    }
}
