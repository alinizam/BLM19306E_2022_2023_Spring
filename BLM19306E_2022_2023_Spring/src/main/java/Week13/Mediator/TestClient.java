/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.Mediator;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        IMediator m=new FlightTowerMediator();
        IColleague f1=new PlaneColleague(m,"İstanbul");
        IColleague f2=new PlaneColleague(m,"Ankara");
        IColleague f3=new PlaneColleague(m,"İzmir");
        
        m.addUser(f1);
        m.addUser(f2);
        m.addUser(f3);
        
        
        m.sendMessage(f1, "Landing");
        m.sendMessage(f2, "Landing");
        m.sendMessage(f3, "Landing");
        
    }
}
