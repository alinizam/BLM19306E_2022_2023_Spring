/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14.State;

/**
 *
 * @author ali.nizam
 */
public class RecordWithoutStatePattern {
    String state;

    public RecordWithoutStatePattern() {
        this.state = "NEW";
    }
    
    void updateState(String action){
        if (state.equals("NEW") && action.equals("CHANGE")){
            state="INSERT";
        }else if (state.equals("INSERT") && action.equals("COMMIT")){
            state="QUERY";
        }else if (state.equals("QUERY") && action.equals("CHANGE")){
            state="MODIFIED";
        }else if (state.equals("MODIFIES") && action.equals("COMMIT")){
            state="QUERY";
        }

    }
    
}
