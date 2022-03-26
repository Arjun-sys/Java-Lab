/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author admin
 */
public class HandlingKeyEvent implements KeyListener{
JTextField tf1,tf2,tf3,tf4;
 JButton b1,b2;
 JLabel l1,l2,l3;
    HandlingKeyEvent()
            {
    JFrame f=new JFrame("ActionListener Example");  
    tf1=new JTextField(10);  
     tf2=new JTextField(10); 
      tf3=new JTextField(10); 
       tf4=new JTextField(10); 
      l1=new JLabel("1st Number");
       l2=new JLabel("2nd Number");
       l3=new JLabel("Press a for add and s for subtract");

    b1=new JButton("Add");  
   
      b2=new JButton("Subtract");  
    tf3.addKeyListener(this);  
    
  
   f.add(l1);
     f.add(tf1);
       f.add(l2);
      f.add(tf2);
      
   
   
       
  f.add(l3);
            f.add(tf3);  
              f.add(tf4);  

    f.setSize(400,400);  
    f.setLayout(new FlowLayout(FlowLayout.CENTER,150,10));  
    f.setVisible(true);   
}  
//3rd step  
public void keyPressed(KeyEvent e){  
   int x,y,z=0;
   x=Integer.parseInt(tf1.getText());
   y=Integer.parseInt(tf2.getText());
    if(e.getKeyChar()=='a')
    
       z=x+y; 
      
   
    else if(e.getKeyChar()=='s')
    
        z=x-y;
         
    else{
     tf3.setText("Press a /s");
     return;
    }
     tf4.setText(String.valueOf(z));
} 
public void keyReleased(KeyEvent e)
{

}
public void keyTyped(KeyEvent e)
{

}
public static void main(String[] args) { 
    new HandlingKeyEvent();
}

}  