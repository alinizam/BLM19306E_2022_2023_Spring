/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.Proxy;

/**
 *
 * @author ali.nizam
 */
public class RootingProxy implements IRequest{

    IRequest request;

    public RootingProxy(IRequest request) {
        this.request = request;
    }
    
    @Override
    public void sendRequest(String request) {
        //Call additional operation of proxy
        String addressofRequest=addWebAddressExtention(request);
        this.request.sendRequest(addressofRequest); 
       
    }
    //Additional operation of proxy
    String addWebAddressExtention(String request){
        return  "http://"+request+".com";
    }
}
