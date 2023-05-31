/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14.NullObject;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        Employee[] employees={new Staff("Ahmet"),new NullEmployee(),new Staff("Ayşe")};
        for (Employee employee : employees) {
            System.out.println(employee.firstName);
        }
    }
}
