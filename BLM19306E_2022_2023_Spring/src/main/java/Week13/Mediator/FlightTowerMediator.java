/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.Mediator;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class FlightTowerMediator implements IMediator {

    ArrayList<IColleague> planes = new ArrayList<>();
    boolean isAvailable;
    int queueSize = 0;

    @Override
    public void sendMessage(IColleague senderPlane, String Message) {
        System.out.println(senderPlane.id+" requests landing");
        if(queueSize == 1){ 
            System.out.println("Landing request is not allowed.");
            return; 
        }
        senderPlane.isFlying=false;
        for (IColleague plane : planes) {
            if (plane != senderPlane && plane.isFlying==true) {
                plane.getRequestMessage(senderPlane.id + " is landing");
            }
        }
        queueSize--;
    }

    @Override
    public void addUser(IColleague p) {
        planes.add(p);
        queueSize++;
    }

}
