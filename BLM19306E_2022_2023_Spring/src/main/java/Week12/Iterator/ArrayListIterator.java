/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ali.nizam
 */
public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Ahmet");
        names.add("Mehmet");
        Iterator<String> nameIter=names.iterator();
        System.out.println(nameIter.next());
        System.out.println(nameIter.next());
    }
}
