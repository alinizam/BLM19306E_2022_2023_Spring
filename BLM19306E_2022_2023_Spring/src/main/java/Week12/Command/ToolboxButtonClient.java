/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.Command;

/**
 *
 * @author ali.nizam
 */
public class ToolboxButtonClient {
    public static void main(String[] args) {
        TextEditor t=new TextEditor();
        ICommand past=new PasteCommand(t);
        //do additional things
        past.execute();
    }
}
