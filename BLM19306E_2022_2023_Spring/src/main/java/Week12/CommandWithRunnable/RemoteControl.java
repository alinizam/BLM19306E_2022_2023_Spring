/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.CommandWithRunnable;

/**
 *
 * @author ali.nizam
 */
public class RemoteControl {
    Runnable button;

    public RemoteControl(Runnable button) {
        this.button = button;
    }
    void pressButton(){
        button.run();
    }
    
    
}
