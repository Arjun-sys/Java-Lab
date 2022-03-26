/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
import java.awt.*;
import javax.swing.JFrame;
/**
 *
 * @author admin
 */
public class AwtFrame  {
    public static void main(String args[])
    {
        Frame f=new Frame();
        Button b=new Button("Click Me");
        f.setSize(300,200);
        f.add(b);
        b.setBounds(30,100,80,30);
        f.setTitle("FRAME by AWT");
         f.setLayout(null);
        f.setVisible(true);
       
        
    }
    
}
