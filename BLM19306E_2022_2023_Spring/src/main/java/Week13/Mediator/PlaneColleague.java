/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.Mediator;

/**
 *
 * @author ali.nizam
 */
public class PlaneColleague extends IColleague{

    public PlaneColleague(IMediator flightTower, String id) {
        super(flightTower, id);
    } 

    @Override
    void landRequestMessage(String s) {
        flightTower.sendMessage(this,s);
    }

    @Override
    void getRequestMessage(String s) {
        System.out.println(id+" screen is showing the messege "+s);
    }
    
    
}
