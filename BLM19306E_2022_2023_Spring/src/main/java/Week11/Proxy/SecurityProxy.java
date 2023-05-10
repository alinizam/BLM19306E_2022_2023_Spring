/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.Proxy;

/**
 *
 * @author ali.nizam
 */
public class SecurityProxy implements IRequest{
    String userName,password;
    
    IRequest request;

    public SecurityProxy(String userName, String password, IRequest request) {
        this.userName = userName;
        this.password = password;
        this.request = request;
    }
    
    public void sendRequest(String request) {
       if(userName==password){
           System.out.println("Username and password can not be the same");
       }else{
           this.request.sendRequest(request); 
       }
    }
    
}
