/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week08.Singleton01;

/**
 *
 * @author ali.nizam
 */
public class SingleObjectEager {

    private static SingleObjectEager instance;

    static {
       instance = new SingleObjectEager();
    }

    public static SingleObjectEager getInstance() {
        return instance;
    }
    
    
}
