/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.Interpreter;

/**
 *
 * @author ali.nizam
 */
public class AndExpressionNonTerminal implements IExpression{
    IExpression digit1expression;
    IExpression digit2expression;

    public AndExpressionNonTerminal(IExpression digit1expression, IExpression digit2expression) {
        this.digit1expression = digit1expression;
        this.digit2expression = digit2expression;
    }
    
    @Override
    public boolean interprate(String context) {
        return digit1expression.interprate(context.substring(0,1))&&digit2expression.interprate(context.substring(1));
    }
        
}
