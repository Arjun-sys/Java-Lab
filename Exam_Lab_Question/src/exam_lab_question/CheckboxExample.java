package exam_lab_question;
import java.awt.*;    
import java.awt.event.*;  
public class CheckboxExample    
{    
     CheckboxExample(){    
       Frame f= new Frame("Checkbox Example");    
       TextField tb = new TextField(16);   
        CheckboxGroup cbg = new CheckboxGroup();  
        Checkbox checkBox1 = new Checkbox("One", false, cbg);      
        Checkbox checkBox2 = new Checkbox("Two",  false, cbg);     
        Checkbox checkBox3 = new Checkbox("Three",  false, cbg);          
        f.add(checkBox1); f.add(checkBox2);f.add(checkBox3); f.add(tb);  
        f.setSize(400,400);  
        f.setLayout(new FlowLayout(FlowLayout.CENTER,200,100));  
        f.setVisible(true);         
        checkBox1.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {               
               tb.setText("One");  
            }  
         });  
        checkBox2.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {               
               tb.setText("Two");  
            }  
         }); 
         checkBox3.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {               
               tb.setText("Three");  
            }  
         }); 
     }    
public static void main(String args[])    
{    
    new CheckboxExample();    
}    
}  