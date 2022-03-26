/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;
//1st step  
public class HandlingActionEvent implements ActionListener{  
 JTextField tf1,tf2,tf3;
 JButton b1,b2;
 JLabel l1,l2,l3;
    HandlingActionEvent()
            {
    JFrame f=new JFrame("ActionListener Example");  
    tf1=new JTextField(10);
    tf1.setToolTipText("Enter The First Number");
     tf2=new JTextField(10); 
      tf3=new JTextField(10); 
      l1=new JLabel("1st Number");
       l2=new JLabel("2nd Number");
       l3=new JLabel("Result");
//    tf1.setBounds(50,50, 150,20);  
// tf2.setBounds(50,100, 150,20);  
//      tf3.setBounds(50,150, 150,20);
    b1=new JButton("Add");  
    b1.setActionCommand("Add");
  //  b1.setBounds(50,100,60,30);  
    //2nd step 
      b2=new JButton("Subtract");  
    b2.addActionListener(this);  
     b2.setActionCommand("Subtract");
   // b2.setBounds(50,150,60,30);  
    //2nd step  
    b1.addActionListener(this);  
   f.add(l1);
     f.add(tf1);
       f.add(l2);
      f.add(tf2);
       f.add(b1);
     f.add(b2);
   
       
  f.add(l3);
            f.add(tf3);  

    f.setSize(400,400);  
    f.setLayout(new FlowLayout(FlowLayout.CENTER,150,10));  
    f.setVisible(true);   
}  
//3rd step  
public void actionPerformed(ActionEvent e){  
   int x,y,z=0;
   x=Integer.parseInt(tf1.getText());
   y=Integer.parseInt(tf2.getText());
    if(e.getActionCommand()=="Add")
    {
       z=x+y; 
    }
     if(e.getActionCommand()=="Subtract")
    {
        z=x-y;
    }
     tf3.setText(String.valueOf(z));
} 
public static void main(String[] args) { 
    new HandlingActionEvent();
}

}  