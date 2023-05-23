/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.Iterator;

/**
 *
 * @author ali.nizam
 */
public class ArrayIterator implements IIterator {

    String[] names;
    
    int index = 0;

    public ArrayIterator(String[] names) {
        this.names = names;
    }

    @Override
    public Object next() { 
        if (index < names.length) {
            return names[index++];
        }
        return null;
    }

    @Override
    public boolean hasNext() { 
        return (index < names.length);
    }

}
