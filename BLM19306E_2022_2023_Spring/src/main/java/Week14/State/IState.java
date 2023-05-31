/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14.State;

/**
 *
 * @author ali.nizam
 */
public interface IState {
    void doCommit(RecordContext record);
    void doModify(RecordContext record);
}
