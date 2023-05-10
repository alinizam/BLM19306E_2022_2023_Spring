/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.COR;

/**
 *
 * @author ali.nizam
 */
public class EmployeeConcreateHandler extends Handler{
     Handler process;

    public EmployeeConcreateHandler(Handler process) {
        super (process);
    }
    @Override
    void handleRequest(Request r) {
        if (r.type.equals("Ordinary")){
            System.out.println("Employee handle the job");
        }else{
            System.out.println("Employee sended");
            super.handleRequest(r);
        }
    }
    
}
