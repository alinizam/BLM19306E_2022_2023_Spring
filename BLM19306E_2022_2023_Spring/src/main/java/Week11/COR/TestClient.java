/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.COR;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        Handler chain=new ManagerConcreateHandler(new EmployeeConcreateHandler(new EmployeeConcreateHandler(null)));
        Request r=new Request("Complex");
        chain.handleRequest(r);
    }
}
