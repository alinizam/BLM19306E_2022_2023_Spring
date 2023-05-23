/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.Interpreter;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        IExpression termimalForDigit0=new TerminalExpression();
        IExpression termimalForDigit1=new TerminalExpression();
        IExpression isNumber=new AndExpressionNonTerminal(termimalForDigit0, termimalForDigit1);
        System.out.println(isNumber.interprate("a0"));
        
        String context="A01";
        for (int i = 0; i < context.length(); i++) {
          //  new AndExpressionNonTerminal(new new TerminalExpression(),new TerminalExpression());
        }
        
    }
}
