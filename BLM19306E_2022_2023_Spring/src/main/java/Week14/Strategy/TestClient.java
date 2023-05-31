/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14.Strategy;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        CalculatorContext calc=new CalculatorContext(new Addition());
        System.out.println(calc.doOperation(5, 8));
        calc.setOperation(new Extract());
        System.out.println(calc.doOperation(5, 8));
        
        System.out.println(calc.doOperation(new Addition(),2, 0));
        
        
        System.out.println(calc.doOperation(new IOperation() {
            @Override
            public int calculate(int a, int b) {
                return a*b;
            }
        },2, 3));
        
        
         System.out.println(calc.doOperation((int a, int b) -> a*b*b,2, 3));
        
         ArrayList<String> names=new ArrayList<>();
         names.add("AHmet");
         names.add("Ayşe");
         names.add("Hamza");
         names.stream().forEach(s->System.out.println(s));
         names.stream().forEach(System.out::println);
         
        
    }
}
