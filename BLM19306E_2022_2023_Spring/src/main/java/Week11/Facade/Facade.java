/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.Facade;

/**
 *
 * @author ali.nizam
 */
public class Facade {

    static void manageSubsystem() {
        SubSystem1 s1 = new SubSystem1();
        SubSystem2 s2 = new SubSystem2();
        SubSystem3 s3 = new SubSystem3();
        s1.doSomething();
        if (s2.doSomething(true)){
            s3.doSomething();
        }
    }
}
