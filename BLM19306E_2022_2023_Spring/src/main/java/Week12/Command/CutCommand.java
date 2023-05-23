/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.Command;

/**
 *
 * @author ali.nizam
 */
public class CutCommand implements ICommand {

    TextEditor t;
    String previousCommand;

    public CutCommand(TextEditor t) {
        this.t = t;
    }

    @Override
    public void execute() {
        if (t.selectedText.isEmpty() && previousCommand.equals("Paste")) {
            return;
        }
        //do some preperation
        t.cut();
    }

}
