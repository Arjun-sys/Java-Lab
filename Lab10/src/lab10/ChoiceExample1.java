/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;
import java.awt.*;   
public class ChoiceExample1 {    
  
         // class constructor  
        ChoiceExample1() {    
  
        // creating a frame  
        Frame f = new Frame();    
  
        // creating a choice component  
        Choice c = new Choice();   
  
        // setting the bounds of choice menu   
        c.setBounds(100, 100, 75, 75);    
   f.add(c); 
        // adding items to the choice menu  
        c.add("Item 1");    
        c.add("Item 2");    
        c.add("Item 3");    
        c.add("Item 4");    
        c.add("Item 5");    
  
        // adding choice menu to frame  
          
  
        // setting size, layout and visibility of frame  
        f.setSize(400, 400);    
        f.setLayout(null);    
        f.setVisible(true);    
     }    
  
// main method  
public static void main(String args[])    
{    
   new ChoiceExample1();    
}    
}     