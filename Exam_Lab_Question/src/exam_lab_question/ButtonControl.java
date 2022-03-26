/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_lab_question;
import java.awt.*;    
public class ButtonControl {    
public static void main (String[] args) {   
  
    // create instance of frame with the label   
    Frame f = new Frame("Button Example");    
  
    // create instance of button with label  
    Button b = new Button("Button");   
  
    // set the position for the button in frame   
    b.setBounds(50,100,80,30);    
  
    // add button to the frame  
    f.add(b);    
    // set size, layout and visibility of frame  
    f.setSize(300,300);    
    f.setLayout(null);    
    f.setVisible(true);     
}    
}    