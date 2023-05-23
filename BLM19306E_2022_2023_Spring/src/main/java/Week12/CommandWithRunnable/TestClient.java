/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.CommandWithRunnable;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        Light l=new Light();
        RemoteControl r=new RemoteControl(l::on);
        r.pressButton();
        RemoteControl r1=new RemoteControl(l::off);
        r1.pressButton();
    }
}
