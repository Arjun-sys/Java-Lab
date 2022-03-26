/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class NoLayout {
    public static void main(String[] agrs)
{
   
  JFrame f;
    
            
            f = new JFrame("No Layout");
            f.setLayout(null);
            f.setTitle("This is an Example border");
           JLabel jl=new JLabel("Name:");
           jl.setBounds(30,50,100,30);
           f.add(jl);
           JTextField jtb=new JTextField ();
           jtb.setBounds(30,100,100,30);
           f.add(jtb);
            f.setSize(300,300);
            f.setVisible(true);

        }

    }
