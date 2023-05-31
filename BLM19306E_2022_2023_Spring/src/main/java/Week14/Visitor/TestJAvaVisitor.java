/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14.Visitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author ali.nizam
 */
public class TestJAvaVisitor {
    public static void main(String[] args) throws IOException {
        
        Files.walkFileTree(Paths.get("c:\\Files"), new MyFileVisitor());
    }
}
