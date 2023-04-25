/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Adaptor;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        //Problamatical adaptation
        /*IRemoteNew rn=new RemoteNew();
        rn.playNew();
        IRemoteOld ro=new RemoteOld();
        ro.play();*/
        
        //Adaptor implementation
        IRemoteNew rn=new RemoteNew();
        rn.playNew();
        
        IRemoteNew ro=new Adaptor(new RemoteOld());
        ro.playNew(); 
        
    }
}
