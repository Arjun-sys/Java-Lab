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
/**
 *
 * @author admin
 */
public class Grid extends Frame{
    Button b1,b2,b3,b4,b5;
    Grid()
    {
        setSize(400,200);
        b1=new Button("NORTH");
        b2=new Button("CENTER");
         b3=new Button("EAST");
          b4=new Button("WEST");
           b5=new Button("SOUTH");
           setLayout(new GridLayout());
           add(b1);
           add(b2);
           add(b3);
           add(b4);
           add(b5);
           setVisible(true);
    }
    
    public static void main(String args[])
    {
        new Grid();
    }
    
}
