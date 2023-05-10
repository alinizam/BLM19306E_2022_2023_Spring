/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.FlyWeigth;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        FlyweightFactory.getColorObject("blue");
        System.out.println(FlyweightFactory.getObjectNumber());
         FlyweightFactory.getColorObject("red");
        System.out.println(FlyweightFactory.getObjectNumber());
         FlyweightFactory.getColorObject("blue");
        System.out.println(FlyweightFactory.getObjectNumber());
         FlyweightFactory.getColorObject("red");
        System.out.println(FlyweightFactory.getObjectNumber());
         FlyweightFactory.getColorObject("blue");
        System.out.println(FlyweightFactory.getObjectNumber());
                 FlyweightFactory.getColorObject("yellow");
        System.out.println(FlyweightFactory.getObjectNumber());
    }
}
