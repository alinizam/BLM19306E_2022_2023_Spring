/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week8.Factory01;

/**
 *
 * @author ali.nizam
 */
public class ProductFactory {
    IProduct createProduct(ProductTypes t){
        IProduct p=null;
        if (t==ProductTypes.Pen){
            p=new Pen();
        }else if(t==ProductTypes.Pencil){
            p=new Pencil();
        }else if(t==ProductTypes.Product){
            p=new Product();
        }
        
        return p;
    }
}
