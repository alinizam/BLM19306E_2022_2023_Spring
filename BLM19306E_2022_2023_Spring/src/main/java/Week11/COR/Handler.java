/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.COR;

/**
 *
 * @author ali.nizam
 */
public abstract class Handler {

    Handler process;

    public Handler(Handler process) {
        this.process = process;
    }

    void handleRequest(Request r) {
        if (process != null) {
            process.handleRequest(r);
        }
    }

}
