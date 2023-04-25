/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Bridge;

/**
 *
 * @author ali.nizam
 */
public class Product implements IProduct{
    IBridgeVehicleType vehicleType;

    public Product(IBridgeVehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
    public void writeVehicleType(){
        vehicleType.prepareVehicle();
    }

    

     
    
}
