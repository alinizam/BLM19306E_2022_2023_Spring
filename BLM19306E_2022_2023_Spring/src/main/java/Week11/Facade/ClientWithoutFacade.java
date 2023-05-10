/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.Facade;

/**
 *
 * @author ali.nizam
 */
public class ClientWithoutFacade {
    public static void main(String[] args) {
        SubSystem1 s1=new SubSystem1();
        SubSystem2 s2=new SubSystem2();
        SubSystem3 s3=new SubSystem3();
        s1.doSomething();
        s2.doSomething(false);
        s3.doSomething();
    }
}
