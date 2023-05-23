/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.Iterator;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        IIterator iter;
        for(iter=new ArrayIterator(new String[]{"Ahmet", "Mehmet", "Ayşe"});iter.hasNext();){
            System.out.println(iter.next());
        }
    }
}
