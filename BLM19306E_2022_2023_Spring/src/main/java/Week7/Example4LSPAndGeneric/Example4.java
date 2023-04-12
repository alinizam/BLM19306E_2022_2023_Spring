/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7.Example4LSPAndGeneric;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ali.nizam
 */
public class Example4 {
    public static void main(String[] args) {
        List<Number> integers = new ArrayList<Number>();
 
        integers.add(2016);
        integers.add(2017);

        //errorneous code
        //List<Integer> numbers=integers;  
         
 
        System.out.println(integers);   // can print [2016, 2017, 1.68]

    }
}
