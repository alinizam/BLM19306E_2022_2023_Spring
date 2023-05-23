/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Week13.Mediator;

/**
 *
 * @author ali.nizam
 */
public abstract class IColleague {
    IMediator flightTower;
    String id;
    boolean isFlying=true;

    public IColleague(IMediator flightTower, String id) {
        this.flightTower = flightTower;
        this.id = id;
    }

   
    abstract void landRequestMessage(String s);
    abstract void getRequestMessage(String s);
    
    
}
