/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.Proxy;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        IRequest i=new RootingProxy(new Request());
        i.sendRequest("personel/add");
        
        IRequest security=new SecurityProxy("A", "B", new RootingProxy(new Request()));
        security.sendRequest("findEmployee");
    }
}
