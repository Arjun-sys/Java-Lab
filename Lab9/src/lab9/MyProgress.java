/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;
import java.awt.Color;
import javax.swing.*;
/**
 *
 * @author admin
 */
public class MyProgress extends JFrame{
    JProgressBar jb;
    int i=0,num=0;
    MyProgress()
    {
        jb=new JProgressBar(0,2000);
        jb.setBounds(40,40,200,30);
        jb.setValue(0);
        jb.setStringPainted(true);
        jb.setBackground(Color.red);
        add(jb);
        setSize(400,400);
        setLayout(null);
        
    }
    public void iterate()
    {
        while(i<=2000)
        {
            jb.setValue(i);
            i+=100;
            try{
                Thread.sleep(150);
            }
            catch(Exception e)
            {
                
            }
        }
    }
    public static void main(String[] args)
    {
        MyProgress m=new MyProgress();
        m.setVisible(true);
        m.iterate();
    }
}
