/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Week13.Mediator;

/**
 *
 * @author ali.nizam
 */
public interface IMediator {
    void sendMessage(IColleague plane, String Message);
    void addUser(IColleague u);
    
}
