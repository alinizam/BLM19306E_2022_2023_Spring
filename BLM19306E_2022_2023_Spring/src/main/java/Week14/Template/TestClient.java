/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14.Template;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        Template t=new ConcreateTemplate1();
        t.templateMethod();
        System.out.println("--------------------");   
        t=new ConscreateTemplate2();
        t.templateMethod();
                
    }
}
