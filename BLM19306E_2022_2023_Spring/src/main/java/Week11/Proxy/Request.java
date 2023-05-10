/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.Proxy;

/**
 *
 * @author ali.nizam
 */
public class Request implements IRequest{

    @Override
    public void sendRequest(String request) {
        System.out.println(request); 
    }
    
}
