/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;
import java.awt.*;    
import java.awt.event.*;    
import javax.swing.JOptionPane;
import javax.swing.*;
public class ItemListenerExample implements ItemListener{    
JCheckBox checkBox1,checkBox2;  
    Label label;  
    ItemListenerExample(){    
        JFrame f= new JFrame("CheckBox Example");    
        label = new Label();            
        label.setAlignment(Label.CENTER);    
        label.setSize(400,100);    
        checkBox1 = new JCheckBox("C++");    
        checkBox1.setBounds(100,100, 50,50);    
        checkBox2 = new JCheckBox("Java");    
        checkBox2.setBounds(100,150, 50,50);    
        f.add(checkBox1); f.add(checkBox2); f.add(label);    
        checkBox1.addItemListener(this);    
        checkBox2.addItemListener(this);    
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true);    
     }    
    public void itemStateChanged(ItemEvent e) {      
        if(e.getSource()==checkBox1)  
            label.setText("C++ Checkbox: "     
            + (e.getStateChange()==1?"checked":"unchecked"));   
        if(e.getSource()==checkBox2)  
        label.setText("Java Checkbox: "     
        + (e.getStateChange()==1?"checked":"unchecked"));    
     }   
public static void main(String args[])    
{    
    new ItemListenerExample();    
}    
}    