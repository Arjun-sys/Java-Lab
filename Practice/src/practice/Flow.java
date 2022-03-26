/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author admin
 */
public class Flow extends JFrame{
    JButton b1,b2,b3,b4,b5;
    Flow()
    {
        setSize(400,200);
        b1=new JButton("NORTH");
        b2=new JButton("CENTER");
         b3=new JButton("EAST");
          b4=new JButton("WEST");
           b5=new JButton("SOUTH");
           setLayout(new FlowLayout(FlowLayout.RIGHT));
           add(b1);
           add(b2);
           add(b3);
           add(b4);
           add(b5);
           setVisible(true);
    }
    
    public static void main(String args[])
    {
        new Flow();
    }
    
}
