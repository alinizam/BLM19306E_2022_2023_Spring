/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14.State;

/**
 *
 * @author ali.nizam
 */
public class NewState implements IState{

    @Override
    public void doCommit(RecordContext record) {
        System.out.println("No action is required");
    }

    @Override
    public void doModify(RecordContext record) {
        record.setState(new InsertState());
        System.out.println("Insert State");
    }
    
}
