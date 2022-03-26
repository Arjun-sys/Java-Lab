/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.awt.*;
/**
 *
 * @author admin
 */
public class BorderExa extends Frame{
    Button b1,b2,b3,b4,b5;
    BorderExa()
    {
        setSize(400,200);
        b1=new Button("NORTH");
        b2=new Button("CENTER");
         b3=new Button("EAST");
          b4=new Button("WEST");
           b5=new Button("SOUTH");
           setLayout(new BorderLayout());
           add(b1,BorderLayout.NORTH);
           add(b2,BorderLayout.CENTER);
           add(b3,BorderLayout.EAST);
           add(b4,BorderLayout.WEST);
           add(b5,BorderLayout.SOUTH);
           setVisible(true);
    }
    
    public static void main(String args[])
    {
        new BorderExa();
    }
    
}
