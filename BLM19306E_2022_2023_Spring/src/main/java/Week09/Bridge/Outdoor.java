/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Bridge;

/**
 *
 * @author ali.nizam
 */
public class Outdoor implements IBridgeVehicleType{

    @Override
    public void prepareVehicle() {
        System.out.println("Make vehicle outdor");
    }
    
}
