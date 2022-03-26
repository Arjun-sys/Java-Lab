/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;  
class MnenomicsAccelerator  
{  
          JMenu menu, submenu;  
          JMenuItem i1, i2, i3, i4, i5;  
          MnenomicsAccelerator(){  
          JFrame f= new JFrame("Menu and MenuItem Example");  
          JMenuBar mb=new JMenuBar();  
          menu=new JMenu("Menu");  
         
          submenu=new JMenu("Sub Menu");  
          i1=new JMenuItem("Item 1"); 
          i1.addActionListener(new ActionListener()
          {
          public void actionPerformed(ActionEvent e)
          {
            JOptionPane.showMessageDialog(f,"I3 Clicked");
          }}
          );
           i5=new JMenuItem("Item 5"); 
          i5.addActionListener(new ActionListener()
          {
          public void actionPerformed(ActionEvent e)
          {
            JOptionPane.showMessageDialog(f,"I5 Clicked");
          }}
          );
          i2=new JMenuItem("Item 2");  
          i3=new JMenuItem("Item 3");  
          i4=new JMenuItem("Item 4");  
          
          menu.add(i1); menu.add(i2); menu.add(i3);  
          submenu.add(i4); submenu.add(i5);  
          menu.add(submenu);  
          mb.add(menu);  
          //ToolTipText
          menu.setToolTipText("This is Menu");
          //Setting Mnemonics for menu
           menu.setMnemonic(KeyEvent.VK_M);
            i5.setMnemonic(KeyEvent.VK_I);
           //setting Accelerator for menuitems
          i1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
          //Enabling and Disabling menu
          i4.setEnabled(false);
         // menu.setEnabled(false);
          f.setJMenuBar(mb);  
          f.setSize(400,400);  
          f.setLayout(null);  
          f.setVisible(true);  
}  
public static void main(String args[])  
{  
new MnenomicsAccelerator();  
}}  