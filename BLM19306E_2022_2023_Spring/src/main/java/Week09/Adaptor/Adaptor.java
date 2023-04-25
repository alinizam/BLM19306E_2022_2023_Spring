/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Adaptor;

/**
 *
 * @author ali.nizam
 */
public class Adaptor implements IRemoteNew{
    //From old to new
    IRemoteOld remoteOld;

    public Adaptor(IRemoteOld remoteOld) {
        this.remoteOld = remoteOld;
    }

    @Override
    public void playNew() {
        remoteOld.play();
    }

}
