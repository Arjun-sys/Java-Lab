/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.awt.Button;
import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class AwtFrameByInheritance extends Frame{
    AwtFrameByInheritance()
    {
       
      Button b=new Button("Click Me");
       b.setBounds(30,100,80,30);
       
          setSize(300,300);
           add(b);
        setTitle("FRAME by AWT");
         setLayout(null);
        setVisible(true);
        
        
          
    }
   
    public static void main(String args[])
    {
      new AwtFrameByInheritance ();
       
        
    }
    
}
