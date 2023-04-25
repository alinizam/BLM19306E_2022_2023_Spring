/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Bridge;

import Week09.BridgeNot.*;

/**
 *
 * @author ali.nizam
 */
public class Car extends Product{

    public Car(IBridgeVehicleType vehicleType ) {
        super(vehicleType);
    }

    @Override
    public void writeVehicleType() {
        System.out.println("This a car");
        super.writeVehicleType(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    

   
    
}
