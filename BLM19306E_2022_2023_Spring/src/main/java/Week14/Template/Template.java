/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14.Template;

/**
 *
 * @author ali.nizam
 */
public abstract class Template {
    abstract void doSomething1();
    abstract void doSomething2();
    abstract void doSomething3();
    final void templateMethod(){
        doSomething1();
        doSomething2();
        doSomething3();
    }
}
