/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week08.Prototype;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Store.cloneFromStore("RedTogg"));
        Car c=Store.cloneFromStore("RedTogg");
        System.out.println(c.color);
        System.out.println(c);
    }
}
