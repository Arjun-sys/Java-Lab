package lab10;
import java.awt.*;  
import java.awt.event.*;  
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class FileDialogDemo extends Frame{  
   FileDialog d;  
    FileDialogDemo() {
        setSize(800,600);
        setVisible(true);
            
        Frame f= new Frame(); 
        
        d = new FileDialog(this , "Dialog Example",FileDialog.LOAD);   
        d.setSize(300,300);    
        d.setVisible(true);  
    }  
    public static void main(String args[])  
    {  
        new FileDialogDemo();  
    }  
}  