/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week8.Factory01;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        ProductFactory f=new ProductFactory();
        System.out.println(f.createProduct(ProductTypes.Pen));
        System.out.println(f.createProduct(ProductTypes.Pencil));
        System.out.println(f.createProduct(ProductTypes.Pencil));    
    }
    
}
