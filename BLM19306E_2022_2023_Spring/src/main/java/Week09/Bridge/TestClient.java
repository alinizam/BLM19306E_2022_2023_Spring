/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Bridge;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        IProduct p=new Car(new Outdoor());
        p.writeVehicleType();
        
        p=new Bike(new Normal());
        p.writeVehicleType();
    }
}
