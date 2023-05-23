/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week08.Singleton01;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        SingleObjectLazy s;
        System.out.println(SingleObjectLazy.getInstance());
        System.out.println(SingleObjectLazy.getInstance());
        System.out.println(SingleObjectLazy.getInstance());
        
        System.out.println("--------------");
        System.out.println(SingleObjectEager.getInstance());
        System.out.println(SingleObjectEager.getInstance());
        System.out.println(SingleObjectEager.getInstance());
    }
}
