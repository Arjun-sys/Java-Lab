/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author admin
 */
public class Border  {


        JFrame f;
        Border()
        {
            
            f = new JFrame();
            f.setLayout(new BorderLayout());
            f.setTitle("This is an Example border");
            JButton b1 = new JButton("North");
            JButton b2 = new JButton("South");

            JButton b3 = new JButton("East");

            JButton b4 = new JButton("West");

            JButton b5 = new JButton("Center");
            f.add(b1,BorderLayout.NORTH);
            f.add(b2,BorderLayout.SOUTH);
            f.add(b3,BorderLayout.EAST);
            f.add(b4,BorderLayout.WEST);
            f.add(b5,BorderLayout.CENTER);
            f.setSize(300,300);
            f.setVisible(true);

        }
public static void main(String[] agrs)
{
    new Border();
}
    }


