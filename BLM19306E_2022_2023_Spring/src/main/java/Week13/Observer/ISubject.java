/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.Observer;

/**
 *
 * @author ali.nizam
 */
public interface ISubject {
    void addObserver(IObserver o);
    void notifyObserver();
}
