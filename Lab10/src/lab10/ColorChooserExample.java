
package lab10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorChooserExample extends JFrame implements ActionListener {
JButton b;
Container c;
ColorChooserExample()
{
    c=getContentPane();
    c.setLayout(new FlowLayout());
    b=new JButton("Color");
    b.addActionListener(this);
    c.add(b);
}
   public void actionPerformed(ActionEvent e)
   {
       Color initialcolor=Color.RED;
       Color color=JColorChooser.showDialog(this,"Select a Color",initialcolor);
       c.setBackground(color);
   }
    public static void main(String[] args) {
       ColorChooserExample ch=new ColorChooserExample();
       ch.setSize(400,400);
       ch.setVisible(true);
       ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
