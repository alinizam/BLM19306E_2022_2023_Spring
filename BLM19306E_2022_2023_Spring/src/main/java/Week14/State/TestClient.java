/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14.State;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        RecordContext record=new RecordContext();
        System.out.println(record.getState());
        record.doCommit();
        System.out.println(record.getState());
         
        record.doModify();
        System.out.println(record.getState());
        
        record.doCommit();
        System.out.println(record.getState());
        
        record.doModify();
        System.out.println(record.getState());
        
    }
}
