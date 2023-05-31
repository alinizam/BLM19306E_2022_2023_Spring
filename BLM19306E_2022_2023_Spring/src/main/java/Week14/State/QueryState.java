/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14.State;

/**
 *
 * @author ali.nizam
 */
public class QueryState implements IState {

    @Override
    public void doCommit(RecordContext record) {
        System.out.println("No action is required");
    }

    @Override
    public void doModify(RecordContext record) {
        record.setState(new ModifiedState());
        System.out.println("Modified State");
    }

    
}
