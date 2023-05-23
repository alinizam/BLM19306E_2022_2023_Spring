/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.Observer;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ali.nizam
 */
public class Example1 {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        JButton b=new JButton("HEllo");
        f.add(b);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.pack();
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Clicked");
            }
        });
    }
}
