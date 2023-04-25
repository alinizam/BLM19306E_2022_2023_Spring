/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Bridge;

/**
 *
 * @author ali.nizam
 */
public class Bike extends Product{
    
    public Bike(IBridgeVehicleType vehicleType) {
        super(vehicleType);
    }

    @Override
    public void writeVehicleType() {
        System.out.println("This a bike");
        super.writeVehicleType(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody

    }
    
    
}
