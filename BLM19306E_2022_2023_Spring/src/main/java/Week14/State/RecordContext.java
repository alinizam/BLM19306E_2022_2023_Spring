/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14.State;

/**
 *
 * @author ali.nizam
 */
public class RecordContext {
    private IState state;

    public RecordContext() {
        this.state = new NewState();
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }
    
    void doCommit(){
        state.doCommit(this);
    }
    void doModify(){
        state.doModify(this);
    } 
    
}
