/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.Command;

/**
 *
 * @author ali.nizam
 */
public class PasteCommand implements ICommand{
    TextEditor t;

    public PasteCommand(TextEditor t) {
        this.t = t;
    }

    @Override
    public void execute() {
        t.past();
    } 
}
