/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
import javax.swing.*;
/**
 *
 * @author admin
 */
public class FirstSwingExample {
    public static void main(String [] args)
    {
        JFrame f=new JFrame();
        JButton b=new JButton("Click");
        b.setBounds(100, 100, 100, 100);
        f.add(b);//adding button in JFarme 
        f.setSize(400, 500);
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making frame vidiblr
    }
    
}
