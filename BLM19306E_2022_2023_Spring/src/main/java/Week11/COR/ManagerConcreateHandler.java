/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.COR;

/**
 *
 * @author ali.nizam
 */
public class ManagerConcreateHandler extends Handler{
    
    public ManagerConcreateHandler(Handler process) {
        super(process);
    }

    @Override
    void handleRequest(Request r) {
        if (r.type.equals("Approve")){
            System.out.println("Manager handle the job");
        }else{
            System.out.println("Meanager sended");
            super.handleRequest(r);
        }
    }
    
    
}
